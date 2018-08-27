package com.company;

public class Handlowiec extends Pracownik {
    //TODO pola imie, nazwisko, id, adres, oddzial, stanowisko masz już w klasie Pracownik. Jeżeli klasa Handlowiec dziedziczy po klasie Pracownik to ma dostęp do tych danych. W tym momencie zrobiłeś duplikacje danych.
    //TODO to pole powinno tylko zostać. Resztę masz w klasie Pracownik-DONE
    private int premiaZasprzedaż;

    public Handlowiec(String imię, String nazwisko, int id, String adres, Oddział oddział, Stanowisko stanowisko, int premiaZasprzedaż) {
        super(imię, nazwisko, id, adres, oddział, stanowisko);
        this.premiaZasprzedaż = premiaZasprzedaż;
    }

    @Override
    public String toString() {
        return "Handlowiec{" +
                "imię='" + getImię() + '\'' +
                ", nazwisko='" + getNazwisko() + '\'' +
                ", id=" + getId() +
                ", adres='" + getAdres() + '\'' +
                ", " + getOddział() +
                ", stanowisko=" + getStanowisko() +
                ", premiaZasprzedaż=" + premiaZasprzedaż +
                '}';

    }
}