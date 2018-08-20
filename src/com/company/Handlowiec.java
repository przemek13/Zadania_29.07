package com.company;

public class Handlowiec extends Pracownik {

    private String imię;
    private String nazwisko;
    private int id;
    private String adres;
    private Oddział oddział;
    private Stanowisko stanowisko;
    private int premiaZasprzedaż;

    public Handlowiec(String imię, String nazwisko, int id, String adres, Oddział oddział, Stanowisko stanowisko, int premiaZasprzedaż) {
        super(imię, nazwisko, id, adres, oddział, stanowisko);
        this.imię = imię;
        this.nazwisko = nazwisko;
        this.id = id;
        this.adres = adres;
        this.oddział = oddział;
        this.stanowisko = stanowisko;
        this.premiaZasprzedaż = premiaZasprzedaż;
    }

    @Override
    public String toString() {
        return "Handlowiec{" +
                "imię='" + imię + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", id=" + id +
                ", adres='" + adres + '\'' +
                ", " + oddział +
                ", stanowisko=" + stanowisko +
                ", premiaZasprzedaż=" + premiaZasprzedaż +
                '}';

    }
}