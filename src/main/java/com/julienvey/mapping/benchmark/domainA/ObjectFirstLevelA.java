package com.julienvey.mapping.benchmark.domainA;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class ObjectFirstLevelA {

    protected BigInteger nombreEnregistrements = BigInteger.ZERO;

    protected Integer nombreSinistresActifs = 0;

    protected Integer nombreSinistresInactifs = 0;

    protected boolean isReponsePartielle = false;

    protected List<ObjectSecondLevelA> sinitres = new ArrayList<ObjectSecondLevelA>();

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

    public List<ObjectSecondLevelA> getSinitres() {
        return sinitres;
    }

    public void setSinitres(List<ObjectSecondLevelA> sinitres) {
        this.sinitres = sinitres;
    }
}
