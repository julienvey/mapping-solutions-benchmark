package com.julienvey.mapping.benchmark.mapper.dozer;

import static org.fest.assertions.Assertions.assertThat;

import org.dozer.DozerBeanMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.julienvey.mapping.benchmark.domainA.ObjectThirdLevelA;
import com.julienvey.mapping.benchmark.domaineB.ObjectThirdLevelB;
import com.julienvey.mapping.benchmark.mapper.utils.ObjectThirdLevelUtils;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext-mapping.xml" })
public class ObjectThirdLevelMapperTest {

    @Autowired
    DozerBeanMapper mapper;

    @Test
    public void test_Apply() {
        ObjectThirdLevelA roleBusiness = ObjectThirdLevelUtils.getAny();

        ObjectThirdLevelB role = mapper.map(roleBusiness, ObjectThirdLevelB.class);

        assertThat(role).isNotNull();

        ObjectThirdLevelUtils.assertEquals(roleBusiness, role);
    }

    @Test
    public void test_Apply_Reverse() {
        ObjectThirdLevelB dto = ObjectThirdLevelUtils.getAnyDto();

        ObjectThirdLevelA role = mapper.map(dto, ObjectThirdLevelA.class);

        assertThat(role).isNotNull();

        ObjectThirdLevelUtils.assertEquals(role, dto);
    }


}
