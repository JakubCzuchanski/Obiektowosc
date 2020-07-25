package com.podstawy.pracaDomowa;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Koszyk {

    private String nazwa;
    private double cena;
    private int lp;

    public static Koszyk[] ekstensja;
    private static int dodajLp;

    static {
        ekstensja = new Koszyk[0];
        dodajLp = 1;
    }


    private void dodajDoEkstensji(Koszyk koszyk) {
        Koszyk[] temp = new Koszyk[ekstensja.length + 1];

        for (int i = 0; i < ekstensja.length; i++) {
            temp[i] = ekstensja[i];
        }
        temp[temp.length - 1] = koszyk;
        ekstensja = temp;

    }



    public static void zaplac() throws FileNotFoundException {
        PrintWriter paragon = new PrintWriter("Paragon.txt");

        System.out.println("Masz w koszyku " + ekstensja.length + " produkty");

        paragon.println("Paragon: ");
        System.out.println("Paragon: ");

        double doZaplacenia = 0;

        for (int i = 0; i < ekstensja.length; i++) {
            doZaplacenia += ekstensja[i].getCena();

            System.out.println(ekstensja[i].getLp() + ". " + ekstensja[i].getNazwa() + " \t" + ekstensja[i].getCena() + "zł");
            paragon.println(ekstensja[i].getLp() + ". " + ekstensja[i].getNazwa() + " \t" + ekstensja[i].getCena() + "zł");

        }

        doZaplacenia = Math.round(doZaplacenia * 100.0) / 100.0;

        System.out.println("\t Do zapłaty " + doZaplacenia);
        paragon.println("\t Do zapłaty " + doZaplacenia);

        paragon.close();

    }




    //konstruktor

    public Koszyk(String nazwa, double cena) {
        setNazwa(nazwa);
        setCena(cena);
        dodajDoEkstensji(this);
        this.lp = dodajLp++;
    }


    //gettery i settery

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public int getLp() {
        return lp;
    }
}
