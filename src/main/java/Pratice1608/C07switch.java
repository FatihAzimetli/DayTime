package Pratice1608;

import java.util.Scanner;

public class C07switch {
    public static void main(String[] args) {
        /*Kullanicidan 0-4 arsai sinav puanini sisteme girmesini isteyin
        *
        * Eger
        * Puani 0,0-1,0 arasinda ise KALDI
        * Puani 1,0-2,0 arasinda ise GECTI
        * Puani 2,0-2,5 arasinda ise IYI
        * Puani 2,5-3,5 arasinda ise Üst
        * Puani 3,5-4,0 arasinda ise HARIKA seviyesi verin
        *
        *
        * switch case kullanarak KALDI seviyesine F
        *                        GECTI seviyesin  D
        *                        IYI   seviyesine C
        *                        UST   seviyesine B
        *                      HARIKA  seviyesine A notu veriniz*/

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen almis oldugunuz Notu Giriniz");
        double not = input.nextInt();

        String seviye;
        char harfNotu;

        if (not >0 && not <1 ){
            seviye ="KALDI";
            harfNotu ='F';
        } else if (not>1 && not<2) {
            seviye ="GECTI";
            harfNotu ='D';
        } else if (not>2 && not<2.5) {
            seviye= "IYI";
            harfNotu='C';
        } else if (not>2.5 && not<3.5) {
            seviye = "ÜST";
            harfNotu = 'B';
        } else if (not>3.5 && not==4.0) {
            seviye = "HARIKA";
            harfNotu = 'A';
        }else {
            System.out.println("Hatali giris yaptiniz Lütfen 0' ile 4' Arasi notunuzu giriniz");
        }







    }
}
