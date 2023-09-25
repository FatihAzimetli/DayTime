package Pratice1608;

import java.util.Scanner;

public class C03Ternary {
    public static void main(String[] args) {
/*Kullamicidan bir sayi isteyin
* Ternary kullanarak
* Girilen sayi cift ise konsola cift yazdirin
* Girilen sayi tek ise girilen sayiyi 3 artirarak konsola yazdirin*/
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int sayi = input.nextInt();
        // Object sonuc = sayi%2 ==0 ?"Cift sayi": "Tek sayi icin sonuc  :" + sayi+3;
        String sonuc = sayi%2 ==0 ?"Cift sayi": "Tek sayi icin sonuc  :" + (sayi+3);

        System.out.println("sonuc = " + sonuc);

    }
}
