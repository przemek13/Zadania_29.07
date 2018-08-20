package com.company;

public class Prezes extends Pracownik {
    private String imię;
    private String nazwisko;
    private int id;
    private String adres;
    private Oddział oddział;
    private Stanowisko stanowisko;
    private int dywidenda;

    public Prezes (String imię, String nazwisko, int id, String adres, Oddział oddział, Stanowisko stanowisko, int dywidenda) {
        super(imię, nazwisko, id, adres, oddział, stanowisko);
        this.imię = imię;
        this.nazwisko = nazwisko;
        this.id = id;
        this.adres = adres;
        this.oddział = oddział;
        this.stanowisko = stanowisko;
        this.dywidenda = dywidenda;
    }

    @Override
    public String toString() {
        return "Prezes{" +
                "imię='" + imię + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", id=" + id +
                ", adres='" + adres + '\'' +
                ", " + oddział +
                ", stanowisko=" + stanowisko +
                ", dywidenda=" + dywidenda +
                '}';

    }
}