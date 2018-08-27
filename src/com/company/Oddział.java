package com.company;

public class Oddział {

    //TODO pola powinny być prywatne-DONE
    private int nrOddziału;
    private String adresOddziału;

    public Oddział(int nrOddziału, String adresOddziału) {
        this.nrOddziału = nrOddziału;
        this.adresOddziału = adresOddziału;

    }

    @Override
    public String toString() {
        return "Oddział{" +
                "nrOddziału=" + nrOddziału +
                ", adresOddziału='" + adresOddziału + '\'' +
                '}';
    }
}


