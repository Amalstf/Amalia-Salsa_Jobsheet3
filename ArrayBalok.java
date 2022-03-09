/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arraybalok;

/**
 *
 * @author Hp
 */
public class ArrayBalok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Balok[]b1Array = new Balok[3];
        segitiga[]b2Array = new segitiga[4];
        
        b1Array[0] = new Balok (100, 30, 12);
        b1Array[1] = new Balok (120, 40, 15);
        b1Array[2] = new Balok (210, 50, 3);
        
        
        b2Array[0] = new segitiga (10, 4);
        b2Array[1] = new segitiga (20, 10);
        b2Array[2] = new segitiga (15, 6);
        b2Array[3] = new segitiga (25, 10);
        
        for(int i = 0; i < 3; i++)
        {
            System.out.println("Volume balok ke " + i + " : " + b1Array[i].hitungVolume());
        }
        
        for(int i = 0; i < 4; i++)
        {
            System.out.println("Luas Segitiga ke " + i + " : " + b2Array[i].hitungLuas());
        }
        
        for(int i = 0; i < 4; i++)
        {
            System.out.println("Keliling Segitiga siku-siku ke " + i + " : " + b2Array[i].hitungKeliling());
        }
        
    }
    
}
