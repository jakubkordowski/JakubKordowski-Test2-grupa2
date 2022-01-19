import pl.imjiad.kordowski.*;

import java.time.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        LocalDate data1 = LocalDate.of(2022, 01, 19);
        LocalDate data2 = LocalDate.of(2020, 05, 11);
        double rachunek1 = 400.50;
        double rachunek2 = 220.10;
        String nazwa1 = "Jakub";
        String nazwa2 = "Tomasz";

        Klient klient1 = new Klient(nazwa1, data1, rachunek1);
        Klient klient2 = new Klient(nazwa2, data1, rachunek1);
        Klient klient3 = new Klient(nazwa1, data2, rachunek1);
        Klient klient4 = new Klient(nazwa2, data1, rachunek2);

        ArrayList<Klient> klienci = new ArrayList<Klient>();
        klienci.add(klient1);
        klienci.add(klient2);
        klienci.add(klient3);
        klienci.add(klient4);

        ObslugaKlienta ob = new ObslugaKlienta(klienci);
        ob.setProcentRabatu();
        System.out.println(ob);
        System.out.println(ob.discountAmount(klient1));
    }

    public static ArrayList<Klient> DiscountMap(ArrayList<Klient> klist){
        
    }
}