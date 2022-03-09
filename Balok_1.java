/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arraykubus;

/**
 *
 * @author Hp
 */
class Balok_1 {
     int panjang, lebar, tinggi;

    Balok_1(int p, int l, int t){
    panjang = p;
    lebar = l;
    tinggi = t;
    
    }
   
    int hitungVolumeBalok(){
        return panjang * tinggi * lebar;
    }
    
    int hitungLuasPermukaanBalok(){
        return  2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }
}
