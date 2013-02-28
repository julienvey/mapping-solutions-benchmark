package com.julienvey.mapping.benchmark.domaineB;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class ObjectFirstLevelB {

    protected BigInteger nombreEnregistrements = BigInteger.ZERO;

    protected Integer nombreSinistresActifs = 0;

    protected Integer nombreSinistresInactifs = 0;

    protected boolean isReponsePartielle = false;

    protected List<ObjectSecondLevelB> sinitres = new ArrayList<ObjectSecondLevelB>();

    public BigInteger getNombreEnregistrements() {
        return nombreEnregistrements;
    }

    public void setNombreEnregistrements(BigInteger nombreEnregistrements) {
        this.nombreEnregistrements = nombreEnregistrements;
    }

    public Integer getNombreSinistresActifs() {
        return nombreSinistresActifs;
    }

    public void setNombreSinistresActifs(Integer nombreSinistresActifs) {
        this.nombreSinistresActifs = nombreSinistresActifs;
    }

    public Integer getNombreSinistresInactifs() {
        return nombreSinistresInactifs;
    }

    public void setNombreSinistresInactifs(Integer nombreSinistresInactifs) {
        this.nombreSinistresInactifs = nombreSinistresInactifs;
    }

    public boolean isReponsePartielle() {
        return isReponsePartielle;
    }

    public void setReponsePartielle(boolean reponsePartielle) {
        isReponsePartielle = reponsePartielle;
    }

    public List<ObjectSecondLevelB> getSinitres() {
        return sinitres;
    }

    public void setSinitres(List<ObjectSecondLevelB> sinitres) {
        this.sinitres = sinitres;
    }
}
