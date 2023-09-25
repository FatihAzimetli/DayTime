package Pratice1608;

import java.util.Scanner;

public class C10StringManupulation {



        public static void main (String[]args){
            /*Kullanicidan ad ve soyadini aliniz bir bosluk olacak sekilde sisteme girmesini isteyiniz
             * Not Yalnizca bir ad ve soyad girilmelidir
             * 1- Ad ve soyadin ilk harfleri büyük olacak sekilde alt alta yazdirin
             * Ad : Canan
             * Soyad : Can*/

            Scanner input = new Scanner(System.in);
            System.out.println("Lütfen adınızı ve soyadınızı giriniz (bir boşluk ile ayrılmalı): ");

            String adSoyad = input.nextLine();
            // İlk boşluğun index'ini bulma
            int spaceIdx = adSoyad.indexOf(" ");

            // Eğer boşluk bulunamazsa veya birden fazla boşluk varsa kontrol edelim
            if (spaceIdx == -1 || adSoyad.lastIndexOf(" ") != spaceIdx) {
                System.out.println("Lütfen sadece bir ad ve bir soyad giriniz.");
                return; // Programı sonlandır
            }

            // İlk harfi büyük yapmak için yardımcı metotu kullanma
            String ad = capitalizeFirstLetter(adSoyad.substring(0, spaceIdx));
            String soyad = capitalizeFirstLetter(adSoyad.substring(spaceIdx + 1));

            System.out.println("Ad: " + ad);
            System.out.println("Soyad: " + soyad);
        }

    public static String capitalizeFirstLetter(String word) {
        if (word == null || word.isEmpty()) {
            return word;
        }
        return Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
        }

}