package com.julienvey.mapping.benchmark.mapper.manual;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.Test;

import com.julienvey.mapping.benchmark.domainA.ObjectSecondLevelA;
import com.julienvey.mapping.benchmark.domaineB.ObjectSecondLevelB;
import com.julienvey.mapping.benchmark.mapper.utils.ObjectSecondLevelUtils;

public class ObjectSecondLevelMapperTest {

    @Test
    public void testApply() throws Exception {
        ObjectSecondLevelA resumeSinistreBusiness = ObjectSecondLevelUtils.getAny();

        ObjectSecondLevelB resumeSinistreDto = ObjectSecondLevelMapper.get().apply(resumeSinistreBusiness);

        assertThat(resumeSinistreDto).isNotNull();

        ObjectSecondLevelUtils.assertEquals(resumeSinistreBusiness, resumeSinistreDto);
    }

    public void test_Apply_Reverse() {
        //Not supposed to happen
    }
}
