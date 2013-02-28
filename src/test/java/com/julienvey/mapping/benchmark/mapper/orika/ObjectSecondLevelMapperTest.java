package com.julienvey.mapping.benchmark.mapper.orika;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.julienvey.mapping.benchmark.domainA.ObjectSecondLevelA;
import com.julienvey.mapping.benchmark.domaineB.ObjectSecondLevelB;
import com.julienvey.mapping.benchmark.mapper.utils.ObjectSecondLevelUtils;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext-mapping.xml" })
public class ObjectSecondLevelMapperTest {

    @Autowired
    OrikaMapper mapper;

    @Test
    public void testApply() throws Exception {
        ObjectSecondLevelA resumeSinistreBusiness = ObjectSecondLevelUtils.getAny();

        ObjectSecondLevelB resumeSinistreDto = mapper.get().map(resumeSinistreBusiness, ObjectSecondLevelB.class);

        assertThat(resumeSinistreDto).isNotNull();

        ObjectSecondLevelUtils.assertEquals(resumeSinistreBusiness, resumeSinistreDto);
    }

    public void test_Apply_Reverse() {
        //Not supposed to happen
    }
}
