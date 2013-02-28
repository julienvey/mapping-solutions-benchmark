package com.julienvey.mapping.benchmark.mapper.manual;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.Test;

import com.julienvey.mapping.benchmark.domainA.ObjectFirstLevelA;
import com.julienvey.mapping.benchmark.domaineB.ObjectFirstLevelB;
import com.julienvey.mapping.benchmark.mapper.utils.ObjectFirstLevelUtils;

public class ObjectFirstLevelMapperTest {


    @Test
    public void testApply() throws Exception {
        ObjectFirstLevelA dossierSinistreAcl = ObjectFirstLevelUtils.getAny();

        ObjectFirstLevelB dossierSinistreDto = ObjectFirstLevelMapper.get().apply(dossierSinistreAcl);

        assertThat(dossierSinistreDto).isNotNull();

        ObjectFirstLevelUtils.assertEquals(dossierSinistreAcl, dossierSinistreDto);
    }

    public void test_Apply_Reverse() {
        // Not working right now
    }
}
