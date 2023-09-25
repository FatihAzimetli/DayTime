package Pratice1608;

import java.util.Scanner;

public class C02NestedIf {
    public static void main(String[] args) {

        /*kullanicidan sisteme bir numara girmesini isteyin
        * eger numara sifirdan kücükse konsola "Negatif sayi" yazdirin
        * Degilse 10'dan kücük olup olmadigina bakin, 10'dan kücükse konsola rakam yazdirin
        * 10'dan büyük yada esit ise konsola "Pozitif Sayi" yazdirin*/

        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int sayi = input.nextInt();

        if (sayi<0){
            System.out.println("NEGATIF");
        } else if (sayi<10) {
            System.out.println("RAKAM");
        }else{
            System.out.println("POZITIF");
        }


    }
}
