package com.julienvey.mapping.benchmark.mapper.utils;


import static com.julienvey.mapping.benchmark.mapper.utils.ValueGenerator.getAString;
import static org.fest.assertions.Assertions.assertThat;

import com.julienvey.mapping.benchmark.domainA.ObjectThirdLevelA;
import com.julienvey.mapping.benchmark.domaineB.ObjectThirdLevelB;

public class ObjectThirdLevelUtils {

    private ObjectThirdLevelUtils() {
    }

    public static void assertEquals(ObjectThirdLevelA roleBusiness, ObjectThirdLevelB role) {
        assertThat(role.getNumeroClient()).isEqualTo(roleBusiness.getNumeroClient());
        assertThat(role.getRole()).isEqualTo(roleBusiness.getRole());
    }

    public static ObjectThirdLevelA getAny() {
        ObjectThirdLevelA roleBusiness = new ObjectThirdLevelA();
        roleBusiness.setNumeroClient(getAString());
        roleBusiness.setRole(getAString());
        roleBusiness.setNom(getAString());
        roleBusiness.setPrenom(getAString());

        return roleBusiness;
    }

    public static ObjectThirdLevelB getAnyDto() {
        ObjectThirdLevelB roleDto = new ObjectThirdLevelB();
        roleDto.setNumeroClient(getAString());
        roleDto.setRole(getAString());
        roleDto.setNom(getAString());
        roleDto.setPrenom(getAString());

        return roleDto;
    }
}
