package com.julienvey.mapping.benchmark.mapper.manual;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.Test;

import com.julienvey.mapping.benchmark.domainA.ObjectThirdLevelA;
import com.julienvey.mapping.benchmark.domaineB.ObjectThirdLevelB;
import com.julienvey.mapping.benchmark.mapper.utils.ObjectThirdLevelUtils;

public class ObjectThirdLevelMapperTest {

    @Test
    public void test_Apply() {
        ObjectThirdLevelA roleBusiness = ObjectThirdLevelUtils.getAny();

        ObjectThirdLevelB role = ObjectThirdLevelMapper.get().apply(roleBusiness);

        assertThat(role).isNotNull();

        ObjectThirdLevelUtils.assertEquals(roleBusiness, role);
    }

}
