package Pratice1608;

import java.util.Scanner;

public class C04Ternary {

    public static void main(String[] args) {

        /*Kullanicidan iki sayi alin
         * Ternary operatörü kullanarak Bu iki sayinin hangisinin daha büyük oldugunu bulup konsola yazdirin*/

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 1'nci rakami giriniz");
        int sayi1 = input.nextInt();

        System.out.println("Lütfen 2'inci rakami giriniz");
        int sayi2 = input.nextInt();

        String sonuc = sayi1<sayi2 ? " Sayi1 kücüktür ": "sayi2 kücüktür";
        System.out.println("sonuc = " + sonuc);

    }
}
