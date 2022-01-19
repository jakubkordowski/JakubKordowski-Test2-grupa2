package pl.imjiad.kordowski;

import java.util.ArrayList;

public class ObslugaKlienta {
    static double procentRabatu;
    private ArrayList<Klient> lista;

    public ObslugaKlienta(ArrayList<Klient> lista){
        this.lista = lista;
    }

    public void setProcentRabatu(){
        double nowa = 0.05;
        procentRabatu = nowa;
    }

    public static double discountAmount(Klient k){
        if(k.getRachunek() > 300){
            return k.getRachunek()*procentRabatu;
        }
        else{
            return 0;
        }
    }
}