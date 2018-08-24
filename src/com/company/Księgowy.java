package com.company;

public class Księgowy extends Pracownik {
    //TODO pola imie, nazwisko, id, adres, oddzial, stanowisko masz już w klasie Pracownik. Jeżeli klasa Księgowy dziedziczy po klasie Pracownik to ma dostęp do tych danych. W tym momencie zrobiłeś duplikacje danych.
    private String imię;
    private String nazwisko;
    private int id;
    private String adres;
    private Oddział oddział;
    private Stanowisko stanowisko;

    //TODO to pole powinno tylko zostać. Resztę masz w klasie Pracownik
    private int premiaZaBrakBłędów;

    public Księgowy(String imię, String nazwisko, int id, String adres, Oddział oddział, Stanowisko stanowisko, int premiaZaBrakBłędów) {
        super(imię, nazwisko, id, adres, oddział, stanowisko);
        this.imię = imię;
        this.nazwisko = nazwisko;
        this.id = id;
        this.adres = adres;
        this.oddział = oddział;
        this.stanowisko = stanowisko;
        this.premiaZaBrakBłędów = premiaZaBrakBłędów;
    }

    @Override
    public String toString() {
        return "Księgowy{" +
                "imię='" + imię + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", id=" + id +
                ", adres='" + adres + '\'' +
                ", " + oddział +
                ", stanowisko=" + stanowisko +
                ", premiaZaBrakBłędów=" + premiaZaBrakBłędów +
                '}';

    }
}
