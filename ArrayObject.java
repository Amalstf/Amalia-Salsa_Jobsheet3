/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arrayobject;

/**
 *
 * @author Hp
 */
public class ArrayObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        persegiPanjang[] ppArray = new persegiPanjang[3];
        
        ppArray[0] = new persegiPanjang();
        ppArray[0].panjang = 110;
        ppArray[0].lebar = 30;
        
        ppArray[1] = new persegiPanjang();
        ppArray[1].panjang = 80;
        ppArray[1].lebar = 40;
        
        ppArray[2] = new persegiPanjang();
        ppArray[2].panjang = 100;
        ppArray[2].lebar = 20;
        
        System.out.println("Persegi Panjang ke-0, panjang : " + ppArray[0].panjang + ", lebar : " + ppArray[0].lebar);
        System.out.println("Persegi Panjang ke-1, panjang : " + ppArray[1].panjang + ", lebar : " + ppArray[1].lebar);
        System.out.println("Persegi Panjang ke-2, panjang : " + ppArray[2].panjang + ", lebar : " + ppArray[2].lebar);
    }
    
}
