package com.julienvey.mapping.benchmark.mapper.caliper;

import com.google.caliper.Param;
import com.google.caliper.Runner;
import com.google.caliper.SimpleBenchmark;
import com.google.common.collect.Lists;
import com.julienvey.mapping.benchmark.domainA.ObjectFirstLevelA;
import com.julienvey.mapping.benchmark.domaineB.ObjectFirstLevelB;
import com.julienvey.mapping.benchmark.mapper.manual.ObjectFirstLevelMapper;
import com.julienvey.mapping.benchmark.mapper.orika.OrikaMapper;
import com.julienvey.mapping.benchmark.mapper.utils.ObjectFirstLevelUtils;
import org.dozer.DozerBeanMapper;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class CaliperBenchmark {

    public static class DozerBenchmark extends SimpleBenchmark {

        DozerBeanMapper dozerBeanMapper;

        private List<ObjectFirstLevelA> dossierSinistreAcls;

        OrikaMapper orikaMapper;

        //@Param({"1", "5", "10", "50", "100", "500", "1000"})
        @Param({"1", "5", "10", "50"})
        private int iterations = 50;

        //@Param({"1", "5", "10", "50", "100", "500", "1000"})
        @Param({"1", "5", "10", "50"})
        private int nbSinistresInDossier = 5;

        public DozerBenchmark() {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext-mapping.xml");
            dozerBeanMapper = context.getBean(DozerBeanMapper.class);
            orikaMapper = context.getBean(OrikaMapper.class);
        }

        @Override
        protected void setUp() throws Exception {
            dossierSinistreAcls = Lists.newArrayList();

            for (int i = 0; i < iterations; i++) {
                dossierSinistreAcls.add(ObjectFirstLevelUtils.getAny(nbSinistresInDossier));
            }
            warmup();
        }

        private void warmup() {
            dozerBeanMapper.map(ObjectFirstLevelUtils.getAny(), ObjectFirstLevelB.class);
            ObjectFirstLevelMapper.get().apply(ObjectFirstLevelUtils.getAny());
            orikaMapper.get().map(ObjectFirstLevelUtils.getAny(), ObjectFirstLevelB.class);
        }

        public void timeDozerMapping(int reps) {
            for (int i = 0; i < reps; i++) {
                for (ObjectFirstLevelA dossierSinistre : dossierSinistreAcls) {
                    dozerBeanMapper.map(dossierSinistre, ObjectFirstLevelB.class);
                }
            }
        }

        public void timeOrikaMapping(int reps) {
            for (int i = 0; i < reps; i++) {
                for (ObjectFirstLevelA dossierSinistre : dossierSinistreAcls) {
                    orikaMapper.get().map(dossierSinistre, ObjectFirstLevelB.class);
                }
            }
        }

        public void timeManuelMapping(int reps) {
            for (int i = 0; i < reps; i++) {
                for (ObjectFirstLevelA dossierSinistre : dossierSinistreAcls) {
                    ObjectFirstLevelMapper.get().apply(dossierSinistre);
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Runner.main(DozerBenchmark.class, args);
    }
}
