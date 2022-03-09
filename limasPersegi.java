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
class limasPersegi {
    int luasAlas, tinggi;

    limasPersegi(int lA, int t){
    luasAlas = lA;
    tinggi = t;
    
    }
   
    int hitungVolumeLimasPersegi(){
        return luasAlas * tinggi * 1/2;
    }
    
    int hitungLuasPermukaanLimasPersegi(){
        return luasAlas + ( 4 *( 1/2 * (luasAlas/2) * tinggi) );
    }
    
}
