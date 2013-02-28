package com.julienvey.mapping.benchmark.mapper.bench;

import java.util.List;

import org.dozer.DozerBeanMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.google.common.collect.Lists;
import com.julienvey.mapping.benchmark.domainA.ObjectFirstLevelA;
import com.julienvey.mapping.benchmark.domaineB.ObjectFirstLevelB;
import com.julienvey.mapping.benchmark.mapper.manual.ObjectFirstLevelMapper;
import com.julienvey.mapping.benchmark.mapper.orika.OrikaMapper;
import com.julienvey.mapping.benchmark.mapper.utils.ObjectFirstLevelUtils;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContext-mapping.xml" })
public class MappingSolutionsPerformanceTest {

    @Autowired
    DozerBeanMapper dozerBeanMapper;

    @Autowired
    OrikaMapper orikaMapper;

    private List<ObjectFirstLevelA> dossierSinistreAcls;

    private static final int ITERATIONS = 50;

    private static final int NB_SINISTRS_IN_DOSSIER = 5;

    @Before
    public void setUp() {
        dossierSinistreAcls = Lists.newArrayList();
        for (int i = 0; i < ITERATIONS; i++) {
            dossierSinistreAcls.add(ObjectFirstLevelUtils.getAny(NB_SINISTRS_IN_DOSSIER));
        }
       warmup();
    }

    private void warmup() {
        dozerBeanMapper.map(ObjectFirstLevelUtils.getAny(), ObjectFirstLevelB.class);
        orikaMapper.get().map(ObjectFirstLevelUtils.getAny(), ObjectFirstLevelB.class);
        ObjectFirstLevelMapper.get().apply(ObjectFirstLevelUtils.getAny());
    }

    @Test
    public void testDozerMapping() {
        long start = System.currentTimeMillis();
        for (ObjectFirstLevelA dossierSinistre : dossierSinistreAcls) {
            dozerBeanMapper.map(dossierSinistre, ObjectFirstLevelB.class);
        }
        long stop = System.currentTimeMillis();
        long duration = (stop - start) / ITERATIONS;
        System.out.println("DozerMapping : Total duration : " + (stop - start) + " ms, " + duration + " ms by mapping");
    }

    @Test
    public void testHandMapping() {
        long start = System.currentTimeMillis();
        for (ObjectFirstLevelA dossierSinistre : dossierSinistreAcls) {
            ObjectFirstLevelMapper.get().apply(dossierSinistre);
        }
        long stop = System.currentTimeMillis();
        long duration = (stop - start) / ITERATIONS;
        System.out.println("HandMapping : Total duration : " + (stop - start) + " ms, " + duration + " ms by mapping");
    }

    @Test
    public void testOrikaMapping() {
        long start = System.currentTimeMillis();
        for (ObjectFirstLevelA dossierSinistre : dossierSinistreAcls) {
            orikaMapper.get().map(dossierSinistre, ObjectFirstLevelB.class);
        }
        long stop = System.currentTimeMillis();
        long duration = (stop - start) / ITERATIONS;
        System.out.println("OrikaMapping : Total duration : " + (stop - start) + " ms, " + duration + " ms by mapping");
    }
}
