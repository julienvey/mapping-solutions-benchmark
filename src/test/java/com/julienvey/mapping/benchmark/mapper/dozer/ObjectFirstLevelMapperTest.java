package com.julienvey.mapping.benchmark.mapper.dozer;

import static org.fest.assertions.Assertions.assertThat;

import org.dozer.DozerBeanMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.julienvey.mapping.benchmark.domainA.ObjectFirstLevelA;
import com.julienvey.mapping.benchmark.domaineB.ObjectFirstLevelB;
import com.julienvey.mapping.benchmark.mapper.utils.ObjectFirstLevelUtils;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext-mapping.xml" })
public class ObjectFirstLevelMapperTest {

    @Autowired
    DozerBeanMapper mapper;

    @Test
    public void testApply() throws Exception {
        ObjectFirstLevelA dossierSinistreAcl = ObjectFirstLevelUtils.getAny();

        ObjectFirstLevelB dossierSinistreDto = mapper.map(dossierSinistreAcl, ObjectFirstLevelB.class);

        assertThat(dossierSinistreDto).isNotNull();

        ObjectFirstLevelUtils.assertEquals(dossierSinistreAcl, dossierSinistreDto);
    }

    public void test_Apply_Reverse() {
        // Not working right now
    }
}
