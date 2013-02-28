package com.julienvey.mapping.benchmark.mapper.utils;

import static com.julienvey.mapping.benchmark.mapper.utils.ValueGenerator.getABigInteger;
import static com.julienvey.mapping.benchmark.mapper.utils.ValueGenerator.getABoolean;
import static com.julienvey.mapping.benchmark.mapper.utils.ValueGenerator.getAnInteger;
import static org.fest.assertions.Assertions.assertThat;

import com.google.common.collect.Lists;
import com.julienvey.mapping.benchmark.domainA.ObjectFirstLevelA;
import com.julienvey.mapping.benchmark.domaineB.ObjectFirstLevelB;

public class ObjectFirstLevelUtils {

    private ObjectFirstLevelUtils() {
    }

    public static void assertEquals(ObjectFirstLevelA dossierSinistreAcl, ObjectFirstLevelB dto) {

        assertThat(dto.getNombreEnregistrements()).isEqualTo(dossierSinistreAcl.getNombreEnregistrements());
        assertThat(dto.getNombreSinistresActifs()).isEqualTo(dossierSinistreAcl.getNombreSinistresActifs());
        assertThat(dto.getNombreSinistresInactifs()).isEqualTo(dossierSinistreAcl.getNombreSinistresInactifs());
        assertThat(dto.isReponsePartielle()).isEqualTo(dossierSinistreAcl.isReponsePartielle());

        assertThat(dto.getSinitres().size()).isEqualTo(dossierSinistreAcl.getSinitres().size());
        // TODO Assert Roles List equals

    }

    public static ObjectFirstLevelA getAny() {
        return getAny(3);
    }

    public static ObjectFirstLevelA getAny(int sinistresSize) {
        ObjectFirstLevelA dossierSinistreAcl = new ObjectFirstLevelA();

        dossierSinistreAcl.setNombreEnregistrements(getABigInteger());
        dossierSinistreAcl.setNombreSinistresActifs(getAnInteger());
        dossierSinistreAcl.setNombreSinistresInactifs(getAnInteger());
        dossierSinistreAcl.setReponsePartielle(getABoolean());

        dossierSinistreAcl.getSinitres().clear();
        for (int i = 0; i < sinistresSize; i++) {
            dossierSinistreAcl.getSinitres().add(ObjectSecondLevelUtils.getAny());
        }

        return dossierSinistreAcl;
    }

    public static ObjectFirstLevelB getAnyDto() {
        ObjectFirstLevelB dto = new ObjectFirstLevelB();

        dto.setNombreEnregistrements(getABigInteger());
        dto.setNombreSinistresActifs(getAnInteger());
        dto.setNombreSinistresInactifs(getAnInteger());
        dto.setReponsePartielle(getABoolean());
        dto.setSinitres(Lists.newArrayList(ObjectSecondLevelUtils.getAnyDto(), ObjectSecondLevelUtils.getAnyDto(),
                        ObjectSecondLevelUtils.getAnyDto()));

        return dto;
    }
}
