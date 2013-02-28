package com.julienvey.mapping.benchmark.domainA;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class ObjectSecondLevelA {

    private static final String[] STATUT_SINISTRE_ACTIF = {"01", "1", "04", "05", "06", "07", "09", "10", "11", "12",
            "13", "16", "17", "18", "19", "23", "25", "30", "31" };

    private List<ObjectThirdLevelA> roles;

    private String numeroContrat;

    private String numeroSinistreCie;

    private String numeroClient;

    private String bilanNature;

    private Date dateSurvenance;

    private Date dateDeclaration;

    private Date dateCloture;

    private String statut;

    private String codeProduitContrat;

    private String libelleProduit;

    private BigDecimal reglementAssure;

    private String reglementAssureDevise;

    private BigDecimal montantTotal;

    private String montantTotalDevise;

    private String systemeOrigineSinistre;

    private String systemeOrigineContrat;

    private String typeSiteGestion;

    private String responsabiliteSinistre;

    private Date dateCompetence;

    private Date dateDROC;

    private String indicateurSinistreGrave;

    private String typeRecours;

    private String nbRecoursSubis;

    private String nbRecoursExerces;

    private String nbRecoursAboutis;

    private String numeroImmatriculationVehicule;

    private String codeNature;

    private String codeSocieteContrat;

    private String numeroSinistreAgent;

    private BigDecimal montantTotalDesReglements;

    public String getCalculerCodeBilanSinistre() {
        StringBuilder codeSinistre = null;

        if (bilanNature != null && codeSocieteContrat != null) {
            codeSinistre = new StringBuilder("");

            codeSinistre.append(codeSocieteContrat);
            codeSinistre.append(bilanNature);
            if (codeNature != null) {
                codeSinistre.append(codeNature);
            }
        }

        return codeSinistre != null ? codeSinistre.toString() : null;
    }

    public boolean isActif() {
        return statut == null ? false : Arrays.asList(STATUT_SINISTRE_ACTIF).contains(statut.trim());
    }

    public List<ObjectThirdLevelA> getRoles() {
        return roles;
    }

    public void setRoles(List<ObjectThirdLevelA> roles) {
        this.roles = roles;
    }

    public String getNumeroContrat() {
        return numeroContrat;
    }

    public void setNumeroContrat(String numeroContrat) {
        this.numeroContrat = numeroContrat;
    }

    public String getNumeroSinistreCie() {
        return numeroSinistreCie;
    }

    public void setNumeroSinistreCie(String numeroSinistreCie) {
        this.numeroSinistreCie = numeroSinistreCie;
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

    public Date getDateSurvenance() {
        return dateSurvenance;
    }

    public void setDateSurvenance(Date dateSurvenance) {
        this.dateSurvenance = dateSurvenance;
    }

    public Date getDateDeclaration() {
        return dateDeclaration;
    }

    public void setDateDeclaration(Date dateDeclaration) {
        this.dateDeclaration = dateDeclaration;
    }

    public Date getDateCloture() {
        return dateCloture;
    }

    public void setDateCloture(Date dateCloture) {
        this.dateCloture = dateCloture;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getCodeProduitContrat() {
        return codeProduitContrat;
    }

    public void setCodeProduitContrat(String codeProduitContrat) {
        this.codeProduitContrat = codeProduitContrat;
    }

    public String getLibelleProduit() {
        return libelleProduit;
    }

    public void setLibelleProduit(String libelleProduit) {
        this.libelleProduit = libelleProduit;
    }

    public BigDecimal getReglementAssure() {
        return reglementAssure;
    }

    public void setReglementAssure(BigDecimal reglementAssure) {
        this.reglementAssure = reglementAssure;
    }

    public String getReglementAssureDevise() {
        return reglementAssureDevise;
    }

    public void setReglementAssureDevise(String reglementAssureDevise) {
        this.reglementAssureDevise = reglementAssureDevise;
    }

    public BigDecimal getMontantTotal() {
        return montantTotal;
    }

    public void setMontantTotal(BigDecimal montantTotal) {
        this.montantTotal = montantTotal;
    }

    public String getMontantTotalDevise() {
        return montantTotalDevise;
    }

    public void setMontantTotalDevise(String montantTotalDevise) {
        this.montantTotalDevise = montantTotalDevise;
    }

    public String getSystemeOrigineSinistre() {
        return systemeOrigineSinistre;
    }

    public void setSystemeOrigineSinistre(String systemeOrigineSinistre) {
        this.systemeOrigineSinistre = systemeOrigineSinistre;
    }

    public String getSystemeOrigineContrat() {
        return systemeOrigineContrat;
    }

    public void setSystemeOrigineContrat(String systemeOrigineContrat) {
        this.systemeOrigineContrat = systemeOrigineContrat;
    }

    public String getTypeSiteGestion() {
        return typeSiteGestion;
    }

    public void setTypeSiteGestion(String typeSiteGestion) {
        this.typeSiteGestion = typeSiteGestion;
    }

    public String getResponsabiliteSinistre() {
        return responsabiliteSinistre;
    }

    public void setResponsabiliteSinistre(String responsabiliteSinistre) {
        this.responsabiliteSinistre = responsabiliteSinistre;
    }

    public Date getDateCompetence() {
        return dateCompetence;
    }

    public void setDateCompetence(Date dateCompetence) {
        this.dateCompetence = dateCompetence;
    }

    public Date getDateDROC() {
        return dateDROC;
    }

    public void setDateDROC(Date dateDROC) {
        this.dateDROC = dateDROC;
    }

    public String getIndicateurSinistreGrave() {
        return indicateurSinistreGrave;
    }

    public void setIndicateurSinistreGrave(String indicateurSinistreGrave) {
        this.indicateurSinistreGrave = indicateurSinistreGrave;
    }

    public String getTypeRecours() {
        return typeRecours;
    }

    public void setTypeRecours(String typeRecours) {
        this.typeRecours = typeRecours;
    }

    public String getNbRecoursSubis() {
        return nbRecoursSubis;
    }

    public void setNbRecoursSubis(String nbRecoursSubis) {
        this.nbRecoursSubis = nbRecoursSubis;
    }

    public String getNbRecoursExerces() {
        return nbRecoursExerces;
    }

    public void setNbRecoursExerces(String nbRecoursExerces) {
        this.nbRecoursExerces = nbRecoursExerces;
    }

    public String getNbRecoursAboutis() {
        return nbRecoursAboutis;
    }

    public void setNbRecoursAboutis(String nbRecoursAboutis) {
        this.nbRecoursAboutis = nbRecoursAboutis;
    }

    public String getNumeroImmatriculationVehicule() {
        return numeroImmatriculationVehicule;
    }

    public void setNumeroImmatriculationVehicule(String numeroImmatriculationVehicule) {
        this.numeroImmatriculationVehicule = numeroImmatriculationVehicule;
    }

    public String getCodeNature() {
        return codeNature;
    }

    public void setCodeNature(String codeNature) {
        this.codeNature = codeNature;
    }

    public String getCodeSocieteContrat() {
        return codeSocieteContrat;
    }

    public void setCodeSocieteContrat(String codeSocieteContrat) {
        this.codeSocieteContrat = codeSocieteContrat;
    }

    public String getNumeroSinistreAgent() {
        return numeroSinistreAgent;
    }

    public void setNumeroSinistreAgent(String numeroSinistreAgent) {
        this.numeroSinistreAgent = numeroSinistreAgent;
    }

    public BigDecimal getMontantTotalDesReglements() {
        return montantTotalDesReglements;
    }

    public void setMontantTotalDesReglements(BigDecimal montantTotalDesReglements) {
        this.montantTotalDesReglements = montantTotalDesReglements;
    }
}
