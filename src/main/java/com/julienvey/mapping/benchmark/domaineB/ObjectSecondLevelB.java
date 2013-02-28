package com.julienvey.mapping.benchmark.domaineB;

import java.math.BigDecimal;
import java.util.ArrayList;

public class ObjectSecondLevelB {

    private String typeRecours;

    private String statut;

    private ArrayList<ObjectThirdLevelB> roles;

    private String responsabiliteSinistre;

    private BigDecimal reglementAssure;

    private String numeroSinistreCie;

    private String numeroImmatriculationVehicule;

    private CustomDate dateDeclaration;

    private CustomDate dateSurvenance;

    private BigDecimal montantTotal;

    private BigDecimal montantTotalDesReglements;

    private String nbRecoursAboutis;

    private String nbRecoursExerces;

    private String nbRecoursSubis;

    private String numeroContrat;

    private CustomDate dateCloture;

    private String codeSocieteContrat;

    private String codeProduitContrat;

    private String numeroClient;

    private String bilanNature;

    private String numeroSinistreAgent;

    private String labelProduit;

    private String exDeclaration;

    private String coutPrev;

    private String recAboutis;

    private String recEmi;

    private String recSubis;

    private boolean isActif;

    private boolean isEnvironnement = false;

    private String systemeOrigineSinistre;

    private String typeSiteGestion;

    private CustomDate dateCompetence;

    private String indicateurSinistreGrave;

    private String systemeOrigineContrat;

    private String calculerCodeBilanSinistre;

    public String getTypeRecours() {
        return typeRecours;
    }

    public void setTypeRecours(String typeRecours) {
        this.typeRecours = typeRecours;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public ArrayList<ObjectThirdLevelB> getRoles() {
        return roles;
    }

    public void setRoles(ArrayList<ObjectThirdLevelB> roles) {
        this.roles = roles;
    }

    public String getResponsabiliteSinistre() {
        return responsabiliteSinistre;
    }

    public void setResponsabiliteSinistre(String responsabiliteSinistre) {
        this.responsabiliteSinistre = responsabiliteSinistre;
    }

    public BigDecimal getReglementAssure() {
        return reglementAssure;
    }

    public void setReglementAssure(BigDecimal reglementAssure) {
        this.reglementAssure = reglementAssure;
    }

    public String getNumeroSinistreCie() {
        return numeroSinistreCie;
    }

    public void setNumeroSinistreCie(String numeroSinistreCie) {
        this.numeroSinistreCie = numeroSinistreCie;
    }

    public String getNumeroImmatriculationVehicule() {
        return numeroImmatriculationVehicule;
    }

    public void setNumeroImmatriculationVehicule(String numeroImmatriculationVehicule) {
        this.numeroImmatriculationVehicule = numeroImmatriculationVehicule;
    }

    public CustomDate getDateDeclaration() {
        return dateDeclaration;
    }

    public void setDateDeclaration(CustomDate dateDeclaration) {
        this.dateDeclaration = dateDeclaration;
    }

    public CustomDate getDateSurvenance() {
        return dateSurvenance;
    }

    public void setDateSurvenance(CustomDate dateSurvenance) {
        this.dateSurvenance = dateSurvenance;
    }

    public BigDecimal getMontantTotal() {
        return montantTotal;
    }

    public void setMontantTotal(BigDecimal montantTotal) {
        this.montantTotal = montantTotal;
    }

    public BigDecimal getMontantTotalDesReglements() {
        return montantTotalDesReglements;
    }

    public void setMontantTotalDesReglements(BigDecimal montantTotalDesReglements) {
        this.montantTotalDesReglements = montantTotalDesReglements;
    }

    public String getNbRecoursAboutis() {
        return nbRecoursAboutis;
    }

    public void setNbRecoursAboutis(String nbRecoursAboutis) {
        this.nbRecoursAboutis = nbRecoursAboutis;
    }

    public String getNbRecoursExerces() {
        return nbRecoursExerces;
    }

    public void setNbRecoursExerces(String nbRecoursExerces) {
        this.nbRecoursExerces = nbRecoursExerces;
    }

    public String getNbRecoursSubis() {
        return nbRecoursSubis;
    }

    public void setNbRecoursSubis(String nbRecoursSubis) {
        this.nbRecoursSubis = nbRecoursSubis;
    }

    public String getNumeroContrat() {
        return numeroContrat;
    }

    public void setNumeroContrat(String numeroContrat) {
        this.numeroContrat = numeroContrat;
    }

    public CustomDate getDateCloture() {
        return dateCloture;
    }

    public void setDateCloture(CustomDate dateCloture) {
        this.dateCloture = dateCloture;
    }

    public String getCodeSocieteContrat() {
        return codeSocieteContrat;
    }

    public void setCodeSocieteContrat(String codeSocieteContrat) {
        this.codeSocieteContrat = codeSocieteContrat;
    }

    public String getCodeProduitContrat() {
        return codeProduitContrat;
    }

    public void setCodeProduitContrat(String codeProduitContrat) {
        this.codeProduitContrat = codeProduitContrat;
    }

    public String getNumeroClient() {
        return numeroClient;
    }

    public void setNumeroClient(String numeroClient) {
        this.numeroClient = numeroClient;
    }

    public String getBilanNature() {
        return bilanNature;
    }

    public void setBilanNature(String bilanNature) {
        this.bilanNature = bilanNature;
    }

    public String getNumeroSinistreAgent() {
        return numeroSinistreAgent;
    }

    public void setNumeroSinistreAgent(String numeroSinistreAgent) {
        this.numeroSinistreAgent = numeroSinistreAgent;
    }

    public String getLabelProduit() {
        return labelProduit;
    }

    public void setLabelProduit(String labelProduit) {
        this.labelProduit = labelProduit;
    }

    public String getExDeclaration() {
        return exDeclaration;
    }

    public void setExDeclaration(String exDeclaration) {
        this.exDeclaration = exDeclaration;
    }

    public String getCoutPrev() {
        return coutPrev;
    }

    public void setCoutPrev(String coutPrev) {
        this.coutPrev = coutPrev;
    }

    public String getRecAboutis() {
        return recAboutis;
    }

    public void setRecAboutis(String recAboutis) {
        this.recAboutis = recAboutis;
    }

    public String getRecEmi() {
        return recEmi;
    }

    public void setRecEmi(String recEmi) {
        this.recEmi = recEmi;
    }

    public String getRecSubis() {
        return recSubis;
    }

    public void setRecSubis(String recSubis) {
        this.recSubis = recSubis;
    }

    public boolean isActif() {
        return isActif;
    }

    public void setActif(boolean actif) {
        isActif = actif;
    }

    public boolean isEnvironnement() {
        return isEnvironnement;
    }

    public void setEnvironnement(boolean environnement) {
        isEnvironnement = environnement;
    }

    public String getSystemeOrigineSinistre() {
        return systemeOrigineSinistre;
    }

    public void setSystemeOrigineSinistre(String systemeOrigineSinistre) {
        this.systemeOrigineSinistre = systemeOrigineSinistre;
    }

    public String getTypeSiteGestion() {
        return typeSiteGestion;
    }

    public void setTypeSiteGestion(String typeSiteGestion) {
        this.typeSiteGestion = typeSiteGestion;
    }

    public CustomDate getDateCompetence() {
        return dateCompetence;
    }

    public void setDateCompetence(CustomDate dateCompetence) {
        this.dateCompetence = dateCompetence;
    }

    public String getIndicateurSinistreGrave() {
        return indicateurSinistreGrave;
    }

    public void setIndicateurSinistreGrave(String indicateurSinistreGrave) {
        this.indicateurSinistreGrave = indicateurSinistreGrave;
    }

    public String getSystemeOrigineContrat() {
        return systemeOrigineContrat;
    }

    public void setSystemeOrigineContrat(String systemeOrigineContrat) {
        this.systemeOrigineContrat = systemeOrigineContrat;
    }

    public String getCalculerCodeBilanSinistre() {
        return calculerCodeBilanSinistre;
    }

    public void setCalculerCodeBilanSinistre(String calculerCodeBilanSinistre) {
        this.calculerCodeBilanSinistre = calculerCodeBilanSinistre;
    }
}
