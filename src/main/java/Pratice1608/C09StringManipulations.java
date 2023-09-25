package Pratice1608;

import java.util.Scanner;

public class C09StringManipulations {
    public static void main(String[] args) {
        /*Kullanicidan ad ve soyadini aliniz bir bosluk olacak sekilde sisteme girmesini isteyiniz
        * Not Yalnizca bir ad ve soyad girilmelidir
        * 1- Ad ve soyadin ilk harfleri büyük olacak sekilde alt alta yazdirin
        * Ad : Canan
        * Soyad : Can*/

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen adınızı ve soyadınızı giriniz (bir boşluk ile ayrılmalı): ");

        String adSoyad = input.nextLine();

        // Girilen metni boşluk karakterine göre böleriz
        String[] adSoyadArray = adSoyad.split(" ");

        // Eğer bölen sonucu iki elemana sahipse, bir ad ve bir soyad girilmiştir
        if (adSoyadArray.length == 2) {
            String ad = adSoyadArray[0];
            String soyad = adSoyadArray[1];

            // İlk harfi büyük yapmak için özel bir metot kullanabiliriz
            ad = capitalizeFirstLetter(ad);
            soyad = capitalizeFirstLetter(soyad);

            System.out.println("Ad: " + ad);
            System.out.println("Soyad: " + soyad);
        } else {
            System.out.println("Lütfen sadece bir ad ve bir soyad giriniz.");
        }
    }

    // İlk harfi büyük yapmak için yardımcı bir metot
    public static String capitalizeFirstLetter(String word) {
        if (word == null || word.isEmpty()) {
            return word;
        }
        return Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
    }
}
