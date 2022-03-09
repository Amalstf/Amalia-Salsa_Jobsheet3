JOBSHEET III ARRAY OF OBJEK
3.1 Tujuan Praktikum
Setelah melakukan materi praktikum ini, mahasiswa mampu:
1. Memahami dan menjelaskan fungsi array yang berisikan variabel objek.
2. Mahasiswa mampu menangkap logika tentang permasalahan array of object dalam Java
3. Mahasiswa mampu menerapkan pembuatan array of object dalam Java
3.2 Membuat Array dari Object, Mengisi dan Menampilkan


Didalam praktikum ini, kita akan mempraktekkan bagaimana membuat array dari object, kemudian mengisi dan menampilkan array tersebut.
3.2.1 Langkah-langkah Percobaan
1. Buat Project baru, dengan nama ArrayObjects. Buat package dengan nama minggu3.
2. Buat class PersegiPanjang:

package arrayobject;
class persegiPanjang {
    public int panjang;
    public int lebar;
  
}

3. Pada fungsi main yaitu pada class ArrayObjects, buatlah array PersegiPanjang yang berisi 3 elemen:
package arrayobject;

public class ArrayObject {

    public static void main(String[] args) {
        // TODO code application logic here
        persegiPanjang[] ppArray = new persegiPanjang[3]; 
}

4. Kemudian isikan masing-masing atributnya
        ppArray[0] = new persegiPanjang();
        ppArray[0].panjang = 110;
        ppArray[0].lebar = 30;
        
        ppArray[1] = new persegiPanjang();
        ppArray[1].panjang = 80;
        ppArray[1].lebar = 40;
        
        ppArray[2] = new persegiPanjang();
        ppArray[2].panjang = 100;
        ppArray[2].lebar = 20;

5. Cetak ke layar semua atribut dari objek ppArray:
        System.out.println("Persegi Panjang ke-0, panjang : " + ppArray[0].panjang + ", lebar : " + ppArray[0].lebar);
        System.out.println("Persegi Panjang ke-1, panjang : " + ppArray[1].panjang + ", lebar : " + ppArray[1].lebar);
        System.out.println("Persegi Panjang ke-2, panjang : " + ppArray[2].panjang + ", lebar : " + ppArray[2].lebar);

6. Jalankan dan amati hasilnya.
Persegi Panjang ke-0, panjang : 110, lebar : 30
Persegi Panjang ke-1, panjang : 80, lebar : 40
Persegi Panjang ke-2, panjang : 100, lebar : 20


3.2.2 Verifikasi Hasil Percobaan
Cocokkan hasil compile kode program anda dengan gambar berikut ini.
Persegi Panjang ke-0, panjang : 110, lebar : 30
Persegi Panjang ke-1, panjang : 80, lebar : 40
Persegi Panjang ke-2, panjang : 100, lebar : 20


3.2.3 Pertanyaan
1. Berdasarkan uji coba 3.2, apakah class yang akan dibuat array of object harus selalu memiliki atribut dan sekaligus method?Jelaskan!
Iya, setiap apakah class yang akan dibuat array of object harus selalu memiliki atribut dan sekaligus method. Dikarenakan atribut dan method selalu berkaitan. Dimana atribut dan method ini sendiri menjadi pemeran utama setelah menemukan object untuk menjalankan suaru class.


2. Apakah class PersegiPanjang memiliki konstruktor?Jika tidak, kenapa dilakukan pemanggilan konstruktur pada baris program berikut :
ppArray[i] = new persegiPanjang(); 

Tidak, karena kontruktor digunakan untuk membuat proses awal dalam mempersiapkan objek dan memberi nilai awal, dan juga untuk memanggil object.

3. Apa yang dimaksud dengan kode berikut ini:
Itu adalah kode untuk memanggil class persegiPanjang, dengan deklarasi dalam kurung yaitu angka 3, mengartikan data yang akan dijalankan atau di proses terdapat 3 atribut.

4. Apa yang dimaksud dengan kode berikut ini:
Itu adalah kode atribut guna memasukkan jumlah Panjang dan lebar yang nantinya akan dijalankan dalam method.

5. Mengapa class main dan juga class PersegiPanjang dipisahkan pada uji coba 3.2?
Karena Ketika class berada dalam atu project di kelas main akan terjadi eror dan tidak bisa dijalankan.

3.3 Menerima Input Isian Array Menggunakan Looping
Pada praktikum ini kita akan mengubah hasil program dari praktikum 3.2 sehingga program dapat menerima input dan menggunakan looping untuk mengisikan atribut dari semua persegi panjang yang ada di ppArray.

3.3.1 Langkah-langkah Percobaan
1. Import scanner pada class ArrayObjects
Note: Letakkan kode import dibawah kode package.

2. Pada praktikum 3.2 poin nomor 4, ganti kodenya dengan kode berikut ini, yaitu membuat objek Scanner untuk menerima input, kemudian melakukan looping untuk menerima input:

3. Pada praktikum 3.2 poin nomor 5, ganti kodenya dengan berikut ini, yaitu melakukan looping untuk mengakses isi array ppArray dan menampilkannya ke layar:

4. Jalankan dan amati hasilnya.

package arrayobject;
import java.util.Scanner;

public class ArrayObject {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        persegiPanjang[] ppArray = new persegiPanjang[3]; 
        Scanner sc = new Scanner (System.in);
        for(int i = 0; i < 3; i++)
        {
            ppArray[i] = new persegiPanjang(); 
            System.out.println("Persegi panjang ke-" + i);
            System.out.print("Masukkan Panjang :");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan lebar : ");
            ppArray[i].lebar = sc.nextInt();
        }
        for (int i = 0; i< 3; i++)
        {
            System.out.println("persegi panjang ke-" + i);
            System.out.println("panjang: " +ppArray[i].panjang + ", lebar : " + ppArray[i].lebar);
        }
    }
    
}

3.3.2 Verifikasi Hasil Percobaan
Contoh verifikasi hasil percobaan ini.

Persegi panjang ke-0
Masukkan Panjang :12
Masukkan lebar : 4
Persegi panjang ke-1
Masukkan Panjang :24
Masukkan lebar : 2
Persegi panjang ke-2
Masukkan Panjang :46
Masukkan lebar : 4
persegi panjang ke-0
panjang: 12, lebar : 4
persegi panjang ke-1
panjang: 24, lebar : 2
persegi panjang ke-2
panjang: 46, lebar : 4

3.3.3 Pertanyaan
1. Apakah array of object dapat diimplementasikan pada array 2 Dimensi?
Iya, array of object dapat diimplementasikan pada array 2 Dimensi

2. Jika jawaban soal no satu iya, berikan contohnya! Jika tidak, jelaskan!
namaBarang[][] nB = new namaBarang[1][1];
     nB[0][0] = new namaBarang();


3. Jika diketahui terdapat class Persegi yang memiliki atribut sisi bertipe integer, maka kode dibawah ini akan memunculkan error saat dijalankan. Mengapa?
Karena jumlah yang akan dihasilkan dapat melampaui jumlah yang dapat dicangkup oleh tipe data integer itu sendiri.

4. Modifikasi kode program pada praktikum 3.3 agar length array menjadi inputan dengan Scanner!
    System.out.print("Panjang Array Yang akan diinput : ");
    int arrayLength = sc.nextInt();
    PersegiPanjang[] ppArray = new PersegiPanjang[arrayLength];

5. Apakah boleh Jika terjadi duplikasi instansiasi array of objek, misalkan saja instansiasi dilakukan pada ppArray[i] sekaligus ppArray[0]?Jelaskan !
Boleh, ketika saya coba melakukan instansi tidak terjadi error dan program masih bisa dijalankan. 


3.4 Operasi Matematika Atribut Object Array
Pada praktikum ini kita akan melakukan pengoperasian matematika beberapa atribut pada masing-masing anggota array.

3.4.1 Langkah-langkah Percobaan
1. Buat package baru ArrayBalok.
2. Buat class Balok:

public class Balok {
    public int panjang;
    public int lebar;
    public int tinggi;
    
    public Balok(int p, int l, int t)
    {
        panjang = p;
        lebar =  l;
        tinggi = t;
    }

    public int hitungVolume()
    {
        return panjang * lebar * tinggi;
    }
    
}

3. Pada fungsi main yaitu pada class ArrayBalok, buat array Balok yang berisi 3 elemen:
public class ArrayBalok {

    public static void main(String[] args) {
        Balok[]b1Array = new Balok[3];
}

4. Kemudian tambahkan kode berikut ini untuk mengisi array blArray menggunakan konstruktor dari class Balok:
        b1Array[0] = new Balok (100, 30, 12);
        b1Array[1] = new Balok (120, 40, 15);
        b1Array[2] = new Balok (210, 50, 3);

5. Tampilkan semua volume balok tersebut dengan cara memanggil method hitungVolume() di dalam looping seperti berikut ini:
for(int i = 0; i < 3; i++)
        {
            System.out.println("Volume balok ke " + i + " : " + b1Array[i].hitungVolume());
        }
6. Jalankan dan amati hasilnya.
ArrayBalok:


package arraybalok;

public class Balok {
    public int panjang;
    public int lebar;
    public int tinggi;
    
    public Balok(int p, int l, int t)
    {
        panjang = p;
        lebar =  l;
        tinggi = t;
    }

    public int hitungVolume()
    {
        return panjang * lebar * tinggi;
    }
    
}

ArrayBalok :

package arraybalok;

public class ArrayBalok {

   
    public static void main(String[] args) {

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

3.4.2 Verifikasi Hasil Percobaan
Cocokkan hasil compile kode program anda dengan gambar berikut ini.

Volume balok ke 0 : 36000
Volume balok ke 1 : 72000
Volume balok ke 2 : 31500

3.4.3 Pertanyaan
1. Dapatkah konstruktor berjumlah lebih dalam satu kelas? Jelaskan dengan contoh!
Iya bisa, sebuah konstruktor dapat berjumlah lebih dari 1 dalam satu kelas.


class persegiPanjang {
    int luas;
    public persegiPanjang(){
    }
    
    public persegiPanjang(int L){
    luas = L;
    }
    
    
}

Tambahkan konstruktor pada class Segitiga tersebut yang berisi parameter int a, int t yang masing-masing digunakan untuk mengisikan atribut alas dan tinggi.
3. Tambahkan method hitungLuas() dan hitungKeliling() pada class Segitiga tersebut.
4. Pada fungsi main, buat array Segitiga sgArray yang berisi 4 elemen, isikan masing-masing atributnya sebagai berikut:
5. Kemudian menggunakan looping, cetak luas dan keliling dengan cara memanggil method hitungLuas() dan hitungKeliling().

Class Balok:

package arraybalok;

public class Balok {
    public int panjang;
    public int lebar;
    public int tinggi;
    
    public Balok(int p, int l, int t)
    {
        panjang = p;
        lebar =  l;
        tinggi = t;
    }

    public int hitungVolume()
    {
        return panjang * lebar * tinggi;
    }
    
}


Class segitiga:

package arraybalok;

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


ArrayBalok:

package arraybalok;

public class ArrayBalok {

    
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

output :

Volume balok ke 0 : 36000
Volume balok ke 1 : 72000
Volume balok ke 2 : 31500
Luas Segitiga ke 0 : 20
Luas Segitiga ke 1 : 100
Luas Segitiga ke 2 : 45
Luas Segitiga ke 3 : 125
Keliling Segitiga siku-siku ke 0 : 20
Keliling Segitiga siku-siku ke 1 : 100
Keliling Segitiga siku-siku ke 2 : 45
Keliling Segitiga siku-siku ke 3 : 125

