package com.company;

public class Księgowy extends Pracownik {
    //TODO pola imie, nazwisko, id, adres, oddzial, stanowisko masz już w klasie Pracownik. Jeżeli klasa Księgowy dziedziczy po klasie Pracownik to ma dostęp do tych danych. W tym momencie zrobiłeś duplikacje danych.
    //TODO to pole powinno tylko zostać. Resztę masz w klasie Pracownik-DONE
    private int premiaZaBrakBłędów;

    public Księgowy(String imię, String nazwisko, int id, String adres, Oddział oddział, Stanowisko stanowisko, int dywidenda) {
        super(imię, nazwisko, id, adres, oddział, stanowisko);
        this.premiaZaBrakBłędów = premiaZaBrakBłędów;
    }

    @Override
    public String toString() {
        return "Księgowy{" +
                "imię='" + getImię() + '\'' +
                ", nazwisko='" + getNazwisko() + '\'' +
                ", id=" + getId() +
                ", adres='" + getAdres() + '\'' +
                ", " + getOddział() +
                ", stanowisko=" + getStanowisko() +
                ", premiaZaBrakBłędów=" + premiaZaBrakBłędów +
                '}';

    }
}
