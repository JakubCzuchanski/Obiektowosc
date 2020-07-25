package com.podstawy.pracaDomowa;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {


        WarzywaOwoce buraki = new WarzywaOwoce("Buraki", 30, 0.52);
        WarzywaOwoce jablka = new WarzywaOwoce("Jabłka", 40, 0.53);
        WarzywaOwoce banany = new WarzywaOwoce("Banany", 50, 0.81);
        WarzywaOwoce pomarancze = new WarzywaOwoce("Pomarańcze", 45, 0.63);

        kup(buraki, 23);
        kup(jablka, 40);
        kup(banany, 6);
        kup(pomarancze, 10);
        System.out.println();

        Koszyk.zaplac();


    }

    public static void kup(WarzywaOwoce nazwa, int ilosc) {
        double doZaplacenia = 0;

        if (nazwa.getIlosc() >= ilosc) {

            doZaplacenia = Math.round((ilosc * nazwa.getCenaJednostkowa())*100.0)/100.0 ;
            nazwa.setIlosc(nazwa.getIlosc() - ilosc);

            Koszyk koszyk = new Koszyk(nazwa.getNazwa(), doZaplacenia);


            System.out.println("Włożyłeś do koszyka " + ilosc + " " + nazwa.getNazwa() + " za " + doZaplacenia + "zł");
        } else {
            System.out.println("Nie mamy tyle " + nazwa.getNazwa() + " na stanie. Dostępna ilość to " + nazwa.getIlosc());

        }
    }

}
