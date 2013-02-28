package com.julienvey.mapping.benchmark.mapper.manual;

import static com.google.common.collect.Lists.newArrayList;
import static com.google.common.collect.Lists.transform;

import com.google.common.base.Function;
import com.julienvey.mapping.benchmark.domainA.ObjectFirstLevelA;
import com.julienvey.mapping.benchmark.domaineB.ObjectFirstLevelB;


public class ObjectFirstLevelMapper implements Function<ObjectFirstLevelA, ObjectFirstLevelB> {

    private static final ObjectFirstLevelMapper INSTANCE = new ObjectFirstLevelMapper();

    public static ObjectFirstLevelMapper get() {
        return INSTANCE;
    }

    private ObjectFirstLevelMapper() {
    }

    @Override
    public ObjectFirstLevelB apply(ObjectFirstLevelA input) {
        if (input == null) {
            return null;
        }

        ObjectFirstLevelB dossierSinistreDto = new ObjectFirstLevelB();

        dossierSinistreDto.setReponsePartielle(input.isReponsePartielle());
        dossierSinistreDto.setNombreSinistresInactifs(input.getNombreSinistresInactifs());
        dossierSinistreDto.setNombreSinistresActifs(input.getNombreSinistresActifs());
        dossierSinistreDto.setNombreEnregistrements(input.getNombreEnregistrements());

        if (input.getSinitres() != null) {
            dossierSinistreDto.setSinitres(newArrayList(transform(input.getSinitres(), ObjectSecondLevelMapper.get())));
        }

        return dossierSinistreDto;
    }

}
