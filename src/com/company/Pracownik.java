package com.company;

public abstract class Pracownik {

    private String imię;
    private String nazwisko;
    private Integer id;
    private String adres;
    private Oddział oddział;
    private Stanowisko stanowisko;

    Pracownik(Integer id, String imię, String nazwisko, String adres, Oddział oddział, Stanowisko stanowisko) {
        this.id = id;
        this.imię = imię;
        this.nazwisko = nazwisko;
        this.adres = adres;
        this.oddział = oddział;
        this.stanowisko = stanowisko;
    }

    public Integer getId() {
        return id;
    }

    public String getImię() { return imię; }

    public String getNazwisko() {
        return nazwisko;
    }

    public Stanowisko getStanowisko() {
        return stanowisko;
    }

    public String getAdres() {
        return adres;
    }

    public Oddział getOddział() {
        return oddział;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pracownik)) return false;

        Pracownik pracownik = (Pracownik) o;

        if (!getImię().equals(pracownik.getImię())) return false;
        if (!getNazwisko().equals(pracownik.getNazwisko())) return false;
        return getAdres().equals(pracownik.getAdres());
    }

    @Override
    public int hashCode() {
        return 0;
    }

//TODO brak toString()-DONE

    @Override
    public String toString() {
        return "Pracownik{" +
                "imię='" + imię + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", id=" + id +
                ", adres='" + adres + '\'' +
                ", oddział=" + oddział +
                ", stanowisko=" + stanowisko +
                '}';
    }
}
