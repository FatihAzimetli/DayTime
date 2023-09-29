package day13MethotCreation_MethodOverloading;

import java.io.StringWriter;

public class C01MetodCration01 {
    public static void main(String[] args) {
        //ornek 1 : 2 sayiyi carpma islemi yapan bir method olusturunuz
        ikiSayiyiCarp(5,8);
        int carpmaSonucu = ikiSayiyiCarp(5,8);
        System.out.println(carpmaSonucu);

        //Ornek 2: Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu sayi ile
        // toplayan method'u olusturunuz ve kullaniniz.
        int sonuc = ilkIkiSayiyiCarpSonSayiyiTopla(2,3,4);
        System.out.println(sonuc);
        //Ornek 3: Girilen bir kelimeyi ekrana yazdiran bir method olusturup kullaniniz.
        print("Laila Mancura");


        //Girlin bir String kelimeden sonra,  iki int sayi carpiniz ve arkasina baska bir kelime yazdirin  medot üretip ekrana yazdirin Örnek--> "Merhaba 20 Dünya"
        String sonucYaz = birKelimeIkisSayiBirKelime("Merhaba", 4, 5, "Dünya");
        System.out.println(sonucYaz);



    }





    //ornek 1 : 2 sayiyi carpma islemi yapan bir method olusturunuz
    public static int ikiSayiyiCarp (int a, int b){
        return a*b;
    }
    //Ornek 2: Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu sayi ile
    // toplayan method'u olusturunuz ve kullaniniz
    public static int ilkIkiSayiyiCarpSonSayiyiTopla (int a, int b, int c){
        return a*b+c;
    }

    //Ornek 3: Girilen bir kelimeyi ekrana yazdiran bir method olusturup kullaniniz.
    public static void print(String str) {
        System.out.println(str);
    }

    //Girilen bir String kelime bir int sayi carpimi ve arkasina girilen baska bir kelime icin medot üretip ekrana yazdirin

    public static String birKelimeIkisSayiBirKelime(String birKelime, int sayi1, int sayi2, String digerKelime) {
        int carpim = sayi1 * sayi2;
        return birKelime + " " + carpim + " " + digerKelime;


    }
}
