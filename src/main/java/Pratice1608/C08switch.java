package Pratice1608;

import java.util.Scanner;

public class C08switch {
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




         switch ((int) not) {
          case 0:
        seviye = "KALDI";
        harfNotu = 'F';
        break;
        case 1:
        seviye = "KALDI";
        harfNotu = 'F';
        break;
        case 2:
        seviye = "GEÇTİ";
        harfNotu = 'D';
        break;
        case 3:
        seviye = "İYİ";
        harfNotu = 'C';
        break;
        case 4:
        seviye = "ÜST";
        harfNotu = 'B';
        break;
        default:
        System.out.println("Geçersiz not girişi.");
        return; // Programı sonlandır
    }

        System.out.println("Notunuz: " + not);
        System.out.println("Seviye: " + seviye);
        System.out.println("Harf Notu: " + harfNotu);

}
}
