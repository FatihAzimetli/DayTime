package Pratice1008;

public class C01Variables {
    public static void main(String[] args) {

        // int bir veriable (yas) olustur ve yazdir
        int yas = 12;
        System.out.println(yas);
        System.out.println("yas = " + yas);

        //int bir veriable(sayi) olustur ve yazdir

        int sayi = 5 ;
        System.out.println(sayi);
        System.out.println("sayi = " + sayi);
//Konsola sayi 50 seklinde yazdir
        System.out.println("Sayi :"+50);
        //yeni bir variable olustur  (benim yasim ve yas veriablelerinin degerini benim yasim veriable'sina kopyala
       int benimYasim = yas;
       // String bir veriable olusturalim (isim)
        String isim = "Ali";
        System.out.println("isim = " + isim);

        //onun ismi variablesini olustur ve isim variable degerini ona ata
        String onunIsmi = isim;
        System.out.println("onunIsmi = " + onunIsmi);

        //isim variable degerini güncelle
        isim = "Can";
        System.out.println("isim = " + isim);
        System.out.println("onunIsmi = " + onunIsmi);


    }
}
