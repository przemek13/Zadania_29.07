package com.company;

public class Księgowy extends Pracownik {
    //TODO pola imie, nazwisko, id, adres, oddzial, stanowisko masz już w klasie Pracownik. Jeżeli klasa Księgowy dziedziczy po klasie Pracownik to ma dostęp do tych danych. W tym momencie zrobiłeś duplikacje danych.
    //TODO to pole powinno tylko zostać. Resztę masz w klasie Pracownik-DONE
    private int premiaZaBrakBłędów;

    public Księgowy(Integer id, String imię, String nazwisko, String adres, Oddział oddział, Stanowisko stanowisko, Integer premiaZaBrakBłędów) {
        super(id, imię, nazwisko, adres, oddział, stanowisko);
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
