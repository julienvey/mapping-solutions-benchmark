package com.julienvey.mapping.benchmark.mapper.manual;

import static com.google.common.collect.Lists.newArrayList;
import static com.google.common.collect.Lists.transform;

import java.util.Calendar;

import com.google.common.base.Function;
import com.julienvey.mapping.benchmark.domainA.ObjectSecondLevelA;
import com.julienvey.mapping.benchmark.domaineB.CustomDate;
import com.julienvey.mapping.benchmark.domaineB.ObjectSecondLevelB;

public class ObjectSecondLevelMapper implements Function<ObjectSecondLevelA, ObjectSecondLevelB> {

    private static final ObjectSecondLevelMapper INSTANCE = new ObjectSecondLevelMapper();

    public static ObjectSecondLevelMapper get() {
        return INSTANCE;
    }

    private ObjectSecondLevelMapper() {
    }

    @Override
    public ObjectSecondLevelB apply(ObjectSecondLevelA iResumeSinistre) {

        if (iResumeSinistre == null) {
            return null;
        }

        ObjectSecondLevelB sinistreDto = new ObjectSecondLevelB();
        sinistreDto.setActif(iResumeSinistre.isActif());
        sinistreDto.setCodeProduitContrat(iResumeSinistre.getCodeProduitContrat());
        sinistreDto.setCodeSocieteContrat(iResumeSinistre.getCodeSocieteContrat());
        sinistreDto.setDateCloture(CustomDate.fromDate(iResumeSinistre.getDateCloture()));
        sinistreDto.setDateDeclaration(CustomDate.fromDate(iResumeSinistre.getDateDeclaration()));
        sinistreDto.setDateSurvenance(CustomDate.fromDate(iResumeSinistre.getDateSurvenance()));
        sinistreDto.setMontantTotal(iResumeSinistre.getMontantTotal());
        sinistreDto.setNbRecoursAboutis(iResumeSinistre.getNbRecoursAboutis());
        sinistreDto.setNbRecoursExerces(iResumeSinistre.getNbRecoursExerces());
        sinistreDto.setNbRecoursSubis(iResumeSinistre.getNbRecoursSubis());
        sinistreDto.setNumeroContrat(iResumeSinistre.getNumeroContrat());
        sinistreDto.setNumeroImmatriculationVehicule(iResumeSinistre.getNumeroImmatriculationVehicule());
        sinistreDto.setNumeroSinistreCie(iResumeSinistre.getNumeroSinistreCie());
        sinistreDto.setReglementAssure(iResumeSinistre.getReglementAssure());
        sinistreDto.setResponsabiliteSinistre(iResumeSinistre.getResponsabiliteSinistre());
        if (iResumeSinistre.getRoles() != null) {
            sinistreDto.setRoles(newArrayList(transform(iResumeSinistre.getRoles(), ObjectThirdLevelMapper.get())));
        }
        sinistreDto.setStatut(iResumeSinistre.getStatut());
        sinistreDto.setTypeRecours(iResumeSinistre.getTypeRecours());
        sinistreDto.setNumeroClient(iResumeSinistre.getNumeroClient());
        sinistreDto.setSystemeOrigineSinistre(iResumeSinistre.getSystemeOrigineSinistre());
        sinistreDto.setSystemeOrigineContrat(iResumeSinistre.getSystemeOrigineContrat());
        sinistreDto.setTypeSiteGestion(iResumeSinistre.getTypeSiteGestion());
        sinistreDto.setDateCompetence(CustomDate.fromDate(iResumeSinistre.getDateCompetence()));
        sinistreDto.setIndicateurSinistreGrave(iResumeSinistre.getIndicateurSinistreGrave());
        sinistreDto.setBilanNature(iResumeSinistre.getBilanNature());
        sinistreDto.setCalculerCodeBilanSinistre(iResumeSinistre.getCalculerCodeBilanSinistre());
        sinistreDto.setNumeroSinistreAgent(iResumeSinistre.getNumeroSinistreAgent());

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(iResumeSinistre.getDateDeclaration());
        sinistreDto.setExDeclaration("" + calendar.get(Calendar.YEAR));
        sinistreDto.setMontantTotalDesReglements(iResumeSinistre.getMontantTotalDesReglements());

        return sinistreDto;
    }
}
