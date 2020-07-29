/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B90;

import java.util.ArrayList;

/**
 *
 * @author Patryk
 */
public class Gracz {

    String nazwa;
    int kasa, liczba_kuponow;
    boolean zwyciezca1,zwyciezca2,zwyciezca3;
    ArrayList<Kupon> kupon = new  ArrayList<>();

    Gracz(String text, int cash) {
        nazwa = text;
        kasa = cash;
        liczba_kuponow = 0;
    }
    
   public void inicjuj_kupony(){
    for(int i = 0; i<liczba_kuponow;i++){
      Kupon k =  new Kupon(nazwa);
      kupon.add(k);
    }
}
}
