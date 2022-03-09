/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arraytanah;

/**
 *
 * @author Hp
 */

public class Tanah {
    int p, l;

    public Tanah(int a, int b) {
        p = a;
        l = b;
    }

    int hitungLuas() {
        int luas = p * l;
        return luas;
    }

}

