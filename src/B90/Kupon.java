/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B90;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Patryk
 */
public class Kupon {

    int[] linia1 = new int[5], linia2 = new int[5], linia3 = new int[5];
    Gracz wlasciciel;
    int trafiona_1 = 0, trafiona_2 = 0, trafiona_3 = 0,ostatnie_trafienie;
    boolean full1, full2, full3, jedna_linia, dwie_linie, trzy_linie;

    Kupon(String nazwa) {
        ArrayList<Integer> beczki = new ArrayList<>();
        for (int i = 1; i <= 90; i++) {
            beczki.add(i);
        }
        Collections.shuffle(beczki);
        for (int i = 0; i < 5; i++) {
            linia1[i] = beczki.get(beczki.size() - 1);
            linia2[i] = beczki.get(beczki.size() - 2);
            linia3[i] = beczki.get(beczki.size() - 3);

            beczki.remove(beczki.size() - 1);
            beczki.remove(beczki.size() - 1);
            beczki.remove(beczki.size() - 1);
        }
    }

    void wykresl_liczbe(int beczka) {
        ostatnie_trafienie = 0;
        for (int i = 0; i < 5; i++) {
            if (linia1[i] == beczka) {
                linia1[i] = 0;
                trafiona_1++;
                if (trafiona_1 == 5) {
                    full1 = true;
                }
                ostatnie_trafienie=1;
                break;
            }
            if (linia2[i] == beczka) {
                linia2[i] = 0;
                trafiona_2++;
                if (trafiona_2 == 5) {
                    full2 = true;
                }
                ostatnie_trafienie=2;
                break;
            }
            if (linia3[i] == beczka) {
                linia3[i] = 0;
                trafiona_3++;
                if (trafiona_3 == 5) {
                    full3 = true;
                }
                ostatnie_trafienie=3;
                break;
            }
        }
        if (full1 == true || full2 == true || full3 == true) {
            jedna_linia = true;
        }
        if ((full1 == true && full2 == true) || (full3 == true && full2 == true) || (full1 == true && full3 == true)) {
            dwie_linie = true;
        }
        if (full1 == true && full2 == true && full3 == true) {
            trzy_linie = true;
        }
    }

    public int getOstatnie_trafienie() {
        return ostatnie_trafienie;
    }
}
