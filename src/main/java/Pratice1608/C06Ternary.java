package Pratice1608;

import java.util.Scanner;

public class C06Ternary {
    public static void main(String[] args) {

       /*Ternary Operatörü ile Bir Sayının Pozitif, Negatif veya Sıfır Olup Olmadığını Kontrol Etme:

        Kullanıcıdan bir sayı alın.
        Ternary operatörünü kullanarak bu sayının pozitif mi, negatif mi yoksa sıfır mı olduğunu nasıl kontrol edebilirsiniz?*/

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int sayi = input.nextInt();

        String sonuc = sayi>0? "Pozitif Sayi" : sayi<0? "Negatif sayi": "Sifira Esittir";
        System.out.println("sonuc = " + sonuc);

    }
}
