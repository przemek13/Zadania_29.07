package com.company;

public class Handlowiec extends Pracownik {
    //TODO pola imie, nazwisko, id, adres, oddzial, stanowisko masz już w klasie Pracownik. Jeżeli klasa Handlowiec dziedziczy po klasie Pracownik to ma dostęp do tych danych. W tym momencie zrobiłeś duplikacje danych.
    //TODO to pole powinno tylko zostać. Resztę masz w klasie Pracownik-DONE
    private int premiaZasprzedaż;

    public Handlowiec(Integer id, String imię, String nazwisko, String adres, Oddział oddział, Stanowisko stanowisko, Integer premiaZasprzedaż) {
        super(id, imię, nazwisko, adres, oddział, stanowisko);
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