/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arraytanah;

import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class ArrayTanah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Tanah Yang Akan Dihitung :  ");
        int hitungan = sc.nextInt();
        System.out.println();
        Tanah[] tnh = new Tanah[hitungan];

        for (int i = 0; i < tnh.length; i++) {
            System.out.print("Masukkan panjang tanah ke - " + (i + 1) + " : ");
            int p = sc.nextInt();
            System.out.print("Masukkan lebar tanah ke - " + (i + 1) + " : ");
            int l = sc.nextInt();
            tnh[i] = new Tanah(p, l);
            System.out.println();
        }

        int a = 0;
        int b = 0;
        for (int i = 0; i < tnh.length; i++) {
            if (tnh[i].hitungLuas() > a) {
                a = tnh[i].hitungLuas();
                b = i + 1;
            }
        }

        for (int i = 0; i < tnh.length; i++) {
            System.out.println("Luas Tanah Ke - " + (i + 1) + " : " + tnh[i].hitungLuas());
        }

        System.out.println("Tanah Terluas Adalah Tanah Ke - " + b);

    }
}
