package Pratice1608;

import java.util.Scanner;

public class C01ifStatements {
    public static void main(String[] args) {

/*Kullanicidan iki sayi isteyi
* Sayilarin ikiside pozitif ise sayilarin toplamini yazdirin
* Ikiside negatif ise sayilarin carpimini yazdirin
* Ikiside farli isaretli ise farkli isaretli sayilar islem yapamasin
* sayilardan biri sifir ise sifir carpmaya göre yutan eleman yazdirin
* */
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen islem icin 1'nci sayiyi giriniz" );
        int sayi1 = input.nextInt();
        System.out.println("Lütfen islem icin 2'nci sayiyi giriniz");
        int sayi2 = input.nextInt();

        if (sayi1 ==0 ||sayi2 ==0){
            System.out.println("0 matamatikte yutan elemandir");
        } else if (sayi1>0 && sayi2>0) {
            System.out.println("Girdiginiz sayilarin toplami :" +(sayi1+sayi2));
        } else if (sayi1<0 && sayi2<0) {
            System.out.println("Girdiginiz sayialarin Carpim  :" +(sayi1*sayi2));
        }else{
            System.out.println("Farkli isaretli sayilarla islem yapilmiyor");
        }


    }
}
