package Pratice1008;

import java.util.Scanner;

public class C05Scanner {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Karesini bulmak istediginiz sayiyi lütfen giriniz");
        int sayi = input.nextInt();
         int sayininKaresi = sayi*sayi;
        System.out.println("sayininKaresi = " + sayininKaresi);

    }
}
