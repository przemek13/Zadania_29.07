package com.company;

public abstract class Pracownik {

    private String imię;
    private String nazwisko;
    private int id;
    private String adres;
    private Oddział oddział;
    private Stanowisko stanowisko;

    Pracownik (String imię, String nazwisko, int id, String adres, Oddział oddział, Stanowisko stanowisko) {
        this.imię=imię;
        this.nazwisko=nazwisko;
        this.id = id;
        this.adres = adres;
        this.oddział = oddział;
        this.stanowisko = stanowisko;
    }

    public int getId() {
        return id;
    }

    public String getImię() {
        return imię;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public Stanowisko getStanowisko() {
        return stanowisko;
    }

    public String getAdres() {
        return adres;
    }

    //TODO brak toString()

}
