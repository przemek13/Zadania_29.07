package com.company;

public class Prezes extends Pracownik {
    //TODO pola imie, nazwisko, id, adres, oddzial, stanowisko masz już w klasie Pracownik. Jeżeli klasa Prezes dziedziczy po klasie Pracownik to ma dostęp do tych danych. W tym momencie zrobiłeś duplikacje danych.
    //TODO to pole powinno tylko zostać. Resztę masz w klasie Pracownik-DONE
    private int dywidenda;

    public Prezes(String imię, String nazwisko, int id, String adres, Oddział oddział, Stanowisko stanowisko, int dywidenda) {
        super(imię, nazwisko, id, adres, oddział, stanowisko);
        this.dywidenda = dywidenda;
    }

    @Override
    public String toString() {
        return "Prezes{" +
                "imię='" + getImię() + '\'' +
                ", nazwisko='" + getNazwisko() + '\'' +
                ", id=" + getId() +
                ", adres='" + getAdres() + '\'' +
                ", " + getOddział() +
                ", stanowisko=" + getStanowisko() +
                ", dywidenda=" + dywidenda +
                '}';

    }

}