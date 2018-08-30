package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BazaPracowników {

    static Pracownik sprawdzany;

    public static List<Pracownik> listaPracowników = new ArrayList<Pracownik>();

    static Scanner input = new Scanner(System.in);

    static int id = 0;

    static int generatorID() {
        return id++;
    }

    public static <T> T getData(String message, Class<T> type) {
        Scanner input = new Scanner(System.in);
        System.out.println(message);
        if (type.getCanonicalName().equals(String.class.getCanonicalName())) {
            return type.cast(input.nextLine());
        } else
            return type.cast(input.nextInt());
    }

    public static <T> void addPracownik() {
        int id = 0;
        id = generatorID();
        String imię = getData("Podaj imię", String.class);
        String nazwisko = getData("Podaj nazwisko", String.class);
        String adres = getData("Podaj adres pracownika", String.class);
        Integer nrOddziału = getData("Podaj numer oddziału", Integer.class);
        String adresOddziału = getData("Podaj adres oddziału", String.class);
        System.out.println("Podaj stanowisko z listy: HANDLOWIEC, KSIĘGOWY, PREZES");
        Stanowisko stanowisko = Stanowisko.valueOf(input.next());
        if (stanowisko.equals(Stanowisko.HANDLOWIEC)) {
            addHandlowiec(imię, nazwisko, adres, nrOddziału, adresOddziału, stanowisko);
        } else if (stanowisko.equals(Stanowisko.KSIĘGOWY)) {
            addKsięgowy(imię, nazwisko, adres, nrOddziału, adresOddziału, stanowisko);
        } else if (stanowisko.equals(Stanowisko.PREZES)) {
            addPrezes(imię, nazwisko, adres, nrOddziału, adresOddziału, stanowisko);
        }
        System.out.println();
    }

    public static void addHandlowiec(String imię, String nazwisko, String adres, int nrOddziału, String adresOddziału, Stanowisko stanowisko) {
        System.out.println("Podaj wielkość premii za sprzedaż");
        Integer premiaZasprzedaż = input.nextInt();
        sprawdzany = (new Handlowiec(id, imię, nazwisko, adres, new Oddział(nrOddziału, adresOddziału), stanowisko, premiaZasprzedaż));
        addSprawdzany(sprawdzany);
    }

    public static void addKsięgowy(String imię, String nazwisko, String adres, int nrOddziału, String adresOddziału, Stanowisko stanowisko) {
        System.out.println("Podaj wielkość premii za brak błędów");
        Integer premiaZaBrakBłędów = input.nextInt();
        sprawdzany = (new Księgowy(id, imię, nazwisko, adres, new Oddział(nrOddziału, adresOddziału), stanowisko, premiaZaBrakBłędów));
        addSprawdzany(sprawdzany);
    }

    public static void addPrezes(String imię, String nazwisko, String adres, int nrOddziału, String adresOddziału, Stanowisko stanowisko) {
        System.out.println("Podaj wielkość dywidendy");
        Integer dywidenda = input.nextInt();
        sprawdzany = (new Prezes(id, imię, nazwisko, adres, new Oddział(nrOddziału, adresOddziału), stanowisko, dywidenda));
        addSprawdzany(sprawdzany);
    }

    public static void addSprawdzany(Pracownik sprawdzany) {
        if (!listaPracowników.isEmpty()) {
            for (Pracownik x : listaPracowników) {
                if (x.equals(sprawdzany)) {
                    System.out.println("Osoba o takich danych jest już w bazie.");
                    break;
                } else {
                    addAndPrint();
                    break;
                }
            }
        } else {
            addAndPrint();
        }
    }

    public static void addAndPrint() {
        listaPracowników.add(sprawdzany);
        System.out.println("Dodano pracownika: " + listaPracowników.get(listaPracowników.size() - 1) + " do bazy.");
    }

    public static void removePracownik() {
        int checkedId;
        System.out.println("Podaj id pracownika");
        checkedId = input.nextInt();
        for (Pracownik x : listaPracowników) {
            if (x.getId() == checkedId) {
                BazaPracowników.listaPracowników.remove(x);
                System.out.println("Usunięto pracownika " + x + " z bazy");
                break;
            } else {
                System.out.print("W bazie nie ma pracownika o podanym ID.");
                break;
            }
        }
    }

    public static void findWithID() {
        int checkedId = 0;
        System.out.println("Podaj id pracownika");
        checkedId = input.nextInt();
        for (Pracownik x : listaPracowników) {
            if (x.getId() == checkedId) {
                System.out.println(x);
            } else {
                System.out.println("W bazie nie ma pracownika o podanym ID");
                break;
            }
        }
    }

    public static void findWithName() {
        String imię = "";
        System.out.println("Podaj imię pracownika");
        imię = input.next();
        for (Pracownik x : listaPracowników) {
            if (x.getImię().equals(imię)) {
                System.out.println(x);
            } else {
                System.out.println("W bazie nie ma pracownika o imieniu");
                break;
            }
        }
    }

    public static void findWithSureName() {
        String nazwisko = "";
        System.out.println("Podaj nazwisko pracownika");
        nazwisko = input.next();
        for (Pracownik x : listaPracowników) {
            if (x.getNazwisko().equals(nazwisko)) {
                System.out.println(x);
            } else {
                System.out.println("W bazie nie ma pracownika o podanym nazwisku");
                break;
            }
        }
    }

    public static void printAll() {
        if (listaPracowników.isEmpty()) {
            System.out.println("Baza pracowników jest pusta");
        } else
            System.out.println("Aktualna lista pracowników:");
        for (Pracownik x : listaPracowników) {
            System.out.println(x);
        }
    }

    public static void findWithPosition() {
        Stanowisko stanowisko = null;
        System.out.println("Podaj nazwisko pracownika");
        stanowisko = Stanowisko.valueOf(input.next());
        for (Pracownik x : listaPracowników) {
            if (x.getStanowisko().equals(stanowisko)) {
                System.out.println(x);
            } else {
                System.out.println("W bazie nie ma pracowników o podanym stanowisku");
                break;
            }
        }
    }

    public static void mainMenu() {

        int menuNav;

        while (true) {

            System.out.println("=============================Baza pracówników firmy X=============================");
            System.out.println("1. Wyświetl wszystkich pracowników");
            System.out.println("2. Dodaj pracownika do bazy");
            System.out.println("3. Usuń pracownika z bazy");
            System.out.println("4. Wyszukaj pracownika");
            System.out.println("5. Wyjście");

            menuNav = input.nextInt();

            if (menuNav != 8) {

                switch (menuNav) {
                    case 1:
                        printAll();
                        break;
                    case 2:
                        addPracownik();
                        break;
                    case 3:
                        removePracownik();
                        break;
                    case 4:
                        findnMenu();
                        break;
                    case 5:
                        System.out.println("Dziękujemy za skorzystanie z bazy. Do widzenia.");
                        return;
                }

            } else
                break;

        }
    }

    public static void findnMenu() {

        int menuNav;

        while (true) {

            System.out.println("1. Wyszukaj po ID");
            System.out.println("2. Wyszukaj po imieniu");
            System.out.println("3. Wyszukaj po nazwisku");
            System.out.println("4. Wyszukaj po stanowisku");
            System.out.println("0. Wyjdź");

            menuNav = input.nextInt();

            if (menuNav != 0) {

                switch (menuNav) {
                    case 1:
                        findWithID();
                        break;
                    case 2:
                        findWithName();
                        break;
                    case 3:
                        findWithSureName();
                        break;
                    case 4:
                        findWithPosition();
                        break;
                    case 0:
                        mainMenu();
                        break;
                }

            } else
                break;

        }
    }
}
