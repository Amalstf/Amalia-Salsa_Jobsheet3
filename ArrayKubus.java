/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arraykubus;

import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class ArrayKubus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kubus[] blArray = new Kubus[3];
        Balok_1[] b2Array = new Balok_1[3];
        limasPersegi[] b3Array = new limasPersegi[3];
        
        Scanner sc = new Scanner(System.in);
        
        for(int i=0; i < 3; i++){
        System.out.print("Sisi : ");
        int s = sc.nextInt();
        blArray[i] = new Kubus(s);
        }
        
        for(int i=0; i < 3; i++){
        System.out.print("Panjang : ");
        int p = sc.nextInt();
        System.out.print("Lebar : ");
        int l = sc.nextInt();
        System.out.print("Tinggi : ");
        int t = sc.nextInt();
        b2Array[i] = new Balok_1(p, l, t);
        }
        
        for(int i=0; i < 3; i++){
        System.out.print("luasAlas : ");
        int lA = sc.nextInt();
        System.out.print("Tinggi : ");
        int t = sc.nextInt();
        b3Array[i] = new limasPersegi(lA, t);
        }
        
        for (int i = 0; i < 3; i ++){
            System.out.println("Kubus ke-" + i + " memiliki volume :" + blArray[i].hitungVolumeKubus());
        }
        
        for (int i = 0; i < 3; i ++){
            System.out.println("Kubus ke-" + i + " memiliki Luas Permukaan :" + blArray[i].hitungLuasPermukaanKubus());
        }
        
        for (int i = 0; i < 3; i ++){
            System.out.println("Balok ke-" + i + " memiliki volume :" + b2Array[i].hitungVolumeBalok());
        }
        
        for (int i = 0; i < 3; i ++){
            System.out.println("Balok ke-" + i + " memiliki Luas Permukaan :" + b2Array[i].hitungLuasPermukaanBalok());
        }
        
        for (int i = 0; i < 3; i ++){
            System.out.println("Balok ke-" + i + " memiliki volume :" + b3Array[i].hitungVolumeLimasPersegi());
        }
        
         for (int i = 0; i < 3; i ++){
            System.out.println("Limas Persgi ke-" + i + " memiliki volume :" + b3Array[i].hitungLuasPermukaanLimasPersegi());
        }
        
        
    }
    
}
