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
class Kubus {
     int sisi;

    Kubus(int s){
    sisi = s;
    }
   
    int hitungVolumeKubus(){
        return sisi * sisi * sisi;
    }
    
    int hitungLuasPermukaanKubus(){
        return 6 * (sisi * sisi);
    }
    
}
