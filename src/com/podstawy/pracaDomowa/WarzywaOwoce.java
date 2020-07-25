// zad 3 Stwórcie tablicę numerowanych owoców z działu owoce i wwarzywa w sklepie, djacie mozliwośc zrealizowania
// akcji w któej uzywkonik chce przyjśc i dokonac zakupu w Waszym sklepie dowolnych produktów w dostepnych ilościach.
// Jak dokona zakupu odejmujemy z dostepnych towarów, natomiast przenosimy do koszyka klienta. Gdy klinet kończy zakupy generujemy paragon
// (plik z produktem, liczności,a ceną i ceną końcową zakupow klienta)

package com.podstawy.pracaDomowa;

public class WarzywaOwoce {

    private String nazwa;
    private int ilosc;
    private double cenaJednostkowa;


    public WarzywaOwoce(String nazwa, int ilosc, double cenaJednostkowa) {
        setNazwa(nazwa);
        setIlosc(ilosc);
        setCenaJednostkowa(cenaJednostkowa);
    }

    public String getNazwa() {
        return nazwa;
    }

    private void setNazwa(String nazwa) {
        if (nazwa.length() > 2) {
            this.nazwa = nazwa;
        } else {
            System.out.println("Niepoporawna nazwa");
        }
    }

    public int getIlosc() {
        return ilosc;
    }

    public void setIlosc(int ilosc) {
        if (ilosc < 0) {
            System.out.println("Nieprawidłowa ilość");
        } else {
            this.ilosc = ilosc;
        }
    }

    public double getCenaJednostkowa() {
        return cenaJednostkowa;
    }

    private void setCenaJednostkowa(double cenaJednostkowa) {
        this.cenaJednostkowa = cenaJednostkowa;
    }
}
