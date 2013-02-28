package com.julienvey.mapping.benchmark.mapper.manual;

import com.google.common.base.Function;
import com.julienvey.mapping.benchmark.domainA.ObjectThirdLevelA;
import com.julienvey.mapping.benchmark.domaineB.ObjectThirdLevelB;

public class ObjectThirdLevelMapper implements Function<ObjectThirdLevelA, ObjectThirdLevelB> {

    private static final ObjectThirdLevelMapper INSTANCE = new ObjectThirdLevelMapper();

    public static ObjectThirdLevelMapper get() {
        return INSTANCE;
    }

    private ObjectThirdLevelMapper() {
    }

    @Override
    public ObjectThirdLevelB apply(ObjectThirdLevelA iRole) {

        if (iRole == null) {
            return null;
        }

        ObjectThirdLevelB roleDto = new ObjectThirdLevelB();
        roleDto.setNumeroClient(iRole.getNumeroClient());
        roleDto.setRole(iRole.getRole());
        roleDto.setNom(iRole.getNom());
        roleDto.setPrenom(iRole.getPrenom());

        return roleDto;
    }
}
