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
class segitiga {
    public int alas;
    public int tinggi;
    
    public segitiga(int a, int t)
    {
        alas = a;
        tinggi = t;
    }
     public int hitungLuas()
    {
        return alas * tinggi * 1/2;
    }
      public int hitungKeliling()
    {
        return (hitungLuas() - alas - tinggi) + alas + tinggi ;
    }
}
