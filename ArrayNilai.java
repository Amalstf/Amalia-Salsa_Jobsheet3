/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arraynilai;
import java.util.Scanner;
public class ArrayNilai {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Nilai[] ppArray = new Nilai[3]; 
        Scanner sc = new Scanner (System.in);
        
        System.out.println("MASUKKAN DATA YANG AKAN DIINPUT");
        System.out.println("=========================================");
        
        for(int i = 0; i < 3; i++)
        {
            ppArray[i] = new Nilai(); 
            System.out.println("Masukkan data mahasiswa Ke-"+ (i+1));
            System.out.print("Masukkan Nama : ");
            ppArray[i].nama = sc.next();
            System.out.print("Masukkan NIM : ");
            ppArray[i].nim = sc.nextInt();
            System.out.print("Masukkan Jenis Kelamin : ");
            ppArray[i].jenisKelamin = sc.next();
            System.out.print("Masukkan IPK : ");
            ppArray[i].ipk = sc.nextDouble();
        }
        
        System.out.println("=========================================");
        
        for (int i = 0; i< 3; i++)
        {
            System.out.println("Data Mahasiswa Ke-"+ (i+1));
            System.out.println("Nama: " +ppArray[i].nama );
            System.out.println( "NIM : " + ppArray[i].nim);
            System.out.println( "Jenis Kelamin : " + ppArray[i].jenisKelamin);
            System.out.println( "Nilai IPK : " + ppArray[i].ipk);
        }
    }
    
}
