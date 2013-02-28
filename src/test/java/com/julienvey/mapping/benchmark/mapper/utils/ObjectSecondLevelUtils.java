package com.julienvey.mapping.benchmark.mapper.utils;


import static com.julienvey.mapping.benchmark.mapper.utils.ValueGenerator.getABigDecimal;
import static com.julienvey.mapping.benchmark.mapper.utils.ValueGenerator.getABoolean;
import static com.julienvey.mapping.benchmark.mapper.utils.ValueGenerator.getACustomDate;
import static com.julienvey.mapping.benchmark.mapper.utils.ValueGenerator.getADate;
import static com.julienvey.mapping.benchmark.mapper.utils.ValueGenerator.getAString;
import static org.fest.assertions.Assertions.assertThat;

import java.util.Calendar;

import com.google.common.collect.Lists;
import com.julienvey.mapping.benchmark.domainA.ObjectSecondLevelA;
import com.julienvey.mapping.benchmark.domaineB.CustomDate;
import com.julienvey.mapping.benchmark.domaineB.ObjectSecondLevelB;

public class ObjectSecondLevelUtils {

    private ObjectSecondLevelUtils() {
    }

    public static void assertEquals(ObjectSecondLevelA resumeSinistreBusiness, ObjectSecondLevelB resumeSinistre) {
        assertThat(resumeSinistre.isActif()).isEqualTo(resumeSinistreBusiness.isActif());
        assertThat(resumeSinistre.getCodeProduitContrat()).isEqualTo(resumeSinistreBusiness.getCodeProduitContrat());
        CustomDateUtils.assertCustomDateEquals(resumeSinistre.getDateCloture(),
                        CustomDate.fromDate(resumeSinistreBusiness.getDateCloture()));
        CustomDateUtils.assertCustomDateEquals(resumeSinistre.getDateSurvenance(),
                        CustomDate.fromDate(resumeSinistreBusiness.getDateSurvenance()));
        CustomDateUtils.assertCustomDateEquals(resumeSinistre.getDateCompetence(),
                        CustomDate.fromDate(resumeSinistreBusiness.getDateCompetence()));
        CustomDateUtils.assertCustomDateEquals(resumeSinistre.getDateDeclaration(),
                CustomDate.fromDate(resumeSinistreBusiness.getDateDeclaration()));
        assertThat(resumeSinistre.getMontantTotal()).isEqualTo(resumeSinistreBusiness.getMontantTotal());
        assertThat(resumeSinistre.getNbRecoursAboutis()).isEqualTo(resumeSinistreBusiness.getNbRecoursAboutis());
        assertThat(resumeSinistre.getNbRecoursExerces()).isEqualTo(resumeSinistreBusiness.getNbRecoursExerces());
        assertThat(resumeSinistre.getNbRecoursSubis()).isEqualTo(resumeSinistreBusiness.getNbRecoursSubis());
        assertThat(resumeSinistre.getNumeroContrat()).isEqualTo(resumeSinistreBusiness.getNumeroContrat());
        assertThat(resumeSinistre.getNumeroImmatriculationVehicule()).isEqualTo(
                        resumeSinistreBusiness.getNumeroImmatriculationVehicule());
        assertThat(resumeSinistre.getNumeroSinistreCie()).isEqualTo(resumeSinistreBusiness.getNumeroSinistreCie());
        assertThat(resumeSinistre.getReglementAssure()).isEqualTo(resumeSinistreBusiness.getReglementAssure());
        assertThat(resumeSinistre.getResponsabiliteSinistre()).isEqualTo(
                        resumeSinistreBusiness.getResponsabiliteSinistre());
        assertThat(resumeSinistre.getStatut()).isEqualTo(resumeSinistreBusiness.getStatut());
        assertThat(resumeSinistre.getTypeRecours()).isEqualTo(resumeSinistreBusiness.getTypeRecours());
        assertThat(resumeSinistre.getNumeroClient()).isEqualTo(resumeSinistreBusiness.getNumeroClient());
        assertThat(resumeSinistre.getSystemeOrigineSinistre()).isEqualTo(
                        resumeSinistreBusiness.getSystemeOrigineSinistre());
        assertThat(resumeSinistre.getSystemeOrigineContrat()).isEqualTo(
                        resumeSinistreBusiness.getSystemeOrigineContrat());
        assertThat(resumeSinistre.getTypeSiteGestion()).isEqualTo(resumeSinistreBusiness.getTypeSiteGestion());
        assertThat(resumeSinistre.getIndicateurSinistreGrave()).isEqualTo(
                        resumeSinistreBusiness.getIndicateurSinistreGrave());
        assertThat(resumeSinistre.getBilanNature()).isEqualTo(resumeSinistreBusiness.getBilanNature());
        assertThat(resumeSinistre.getCalculerCodeBilanSinistre()).isEqualTo(
                        resumeSinistreBusiness.getCalculerCodeBilanSinistre());
        assertThat(resumeSinistre.getNumeroSinistreAgent()).isEqualTo(resumeSinistreBusiness.getNumeroSinistreAgent());
        assertThat(resumeSinistre.getExDeclaration()).isEqualTo(getYearAsString(resumeSinistreBusiness));
        assertThat(resumeSinistre.getMontantTotalDesReglements()).isEqualTo(
                        resumeSinistreBusiness.getMontantTotalDesReglements());

        assertThat(resumeSinistre.getRoles().size()).isEqualTo(resumeSinistreBusiness.getRoles().size());
        // TODO Assert Roles List equals

    }

    private static String getYearAsString(ObjectSecondLevelA resumeSinistreBusiness) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(resumeSinistreBusiness.getDateDeclaration());
        return "" + calendar.get(Calendar.YEAR);
    }

    public static ObjectSecondLevelA getAny() {
        ObjectSecondLevelA resumeSinistreBusiness = new ObjectSecondLevelA();

        resumeSinistreBusiness.setBilanNature(getAString());
        resumeSinistreBusiness.setCodeNature(getAString());
        resumeSinistreBusiness.setCodeProduitContrat(getAString());
        resumeSinistreBusiness.setCodeSocieteContrat(getAString());
        resumeSinistreBusiness.setDateCloture(getADate());
        resumeSinistreBusiness.setDateCompetence(getADate());
        resumeSinistreBusiness.setDateDeclaration(getADate());
        resumeSinistreBusiness.setDateDROC(getADate());
        resumeSinistreBusiness.setDateSurvenance(getADate());
        resumeSinistreBusiness.setIndicateurSinistreGrave(getAString());
        resumeSinistreBusiness.setLibelleProduit(getAString());
        resumeSinistreBusiness.setMontantTotal(getABigDecimal());
        resumeSinistreBusiness.setMontantTotalDesReglements(getABigDecimal());
        resumeSinistreBusiness.setMontantTotalDevise(getAString());
        resumeSinistreBusiness.setNbRecoursAboutis(getAString());
        resumeSinistreBusiness.setNbRecoursExerces(getAString());
        resumeSinistreBusiness.setNbRecoursSubis(getAString());
        resumeSinistreBusiness.setNumeroClient(getAString());
        resumeSinistreBusiness.setNumeroContrat(getAString());
        resumeSinistreBusiness.setReglementAssure(getABigDecimal());
        resumeSinistreBusiness.setReglementAssureDevise(getAString());
        resumeSinistreBusiness.setResponsabiliteSinistre(getAString());
        resumeSinistreBusiness.setStatut(getAString());
        resumeSinistreBusiness.setSystemeOrigineContrat(getAString());
        resumeSinistreBusiness.setSystemeOrigineSinistre(getAString());
        resumeSinistreBusiness.setTypeRecours(getAString());
        resumeSinistreBusiness.setTypeSiteGestion(getAString());
        resumeSinistreBusiness.setRoles(Lists.newArrayList(ObjectThirdLevelUtils.getAny(), ObjectThirdLevelUtils.getAny(), ObjectThirdLevelUtils.getAny()));

        return resumeSinistreBusiness;
    }

    public static ObjectSecondLevelB getAnyDto() {
        ObjectSecondLevelB resumeSinistreDto = new ObjectSecondLevelB();

        resumeSinistreDto.setNumeroClient(getAString());

        resumeSinistreDto.setActif(getABoolean());
        resumeSinistreDto.setTypeRecours(getAString());
        resumeSinistreDto.setStatut(getAString());
        resumeSinistreDto.setRoles(Lists.newArrayList(ObjectThirdLevelUtils.getAnyDto(), ObjectThirdLevelUtils.getAnyDto(),
                        ObjectThirdLevelUtils.getAnyDto()));
        resumeSinistreDto.setResponsabiliteSinistre(getAString());
        resumeSinistreDto.setReglementAssure(getABigDecimal());
        resumeSinistreDto.setNumeroSinistreCie(getAString());
        resumeSinistreDto.setNumeroImmatriculationVehicule(getAString());
        resumeSinistreDto.setDateDeclaration(getACustomDate());
        resumeSinistreDto.setDateSurvenance(getACustomDate());
        resumeSinistreDto.setMontantTotal(getABigDecimal());
        resumeSinistreDto.setNbRecoursAboutis(getAString());
        resumeSinistreDto.setNbRecoursExerces(getAString());
        resumeSinistreDto.setNbRecoursSubis(getAString());
        resumeSinistreDto.setNumeroContrat(getAString());
        resumeSinistreDto.setDateCloture(getACustomDate());
        resumeSinistreDto.setCodeSocieteContrat(getAString());
        resumeSinistreDto.setCodeProduitContrat(getAString());
        resumeSinistreDto.setNumeroClient(getAString());
        resumeSinistreDto.setEnvironnement(getABoolean());
        resumeSinistreDto.setBilanNature(getAString());
        resumeSinistreDto.setNumeroSinistreAgent(getAString());
        resumeSinistreDto.setLabelProduit(getAString());
        resumeSinistreDto.setExDeclaration(getAString());
        resumeSinistreDto.setCoutPrev(getAString());
        resumeSinistreDto.setRecAboutis(getAString());
        resumeSinistreDto.setRecEmi(getAString());
        resumeSinistreDto.setRecSubis(getAString());
        resumeSinistreDto.setCalculerCodeBilanSinistre(getAString());
        resumeSinistreDto.setSystemeOrigineSinistre(getAString());
        resumeSinistreDto.setTypeSiteGestion(getAString());
        resumeSinistreDto.setDateCompetence(getACustomDate());
        resumeSinistreDto.setIndicateurSinistreGrave(getAString());
        resumeSinistreDto.setMontantTotalDesReglements(getABigDecimal());
        resumeSinistreDto.setSystemeOrigineContrat(getAString());

        return resumeSinistreDto;
    }
}
