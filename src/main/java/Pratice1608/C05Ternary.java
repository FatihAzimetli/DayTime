package Pratice1608;

import java.util.Scanner;

public class C05Ternary {
    public static void main(String[] args) {
        /*Ternary Operatörü ile İki Sayının Toplamını veya Farkını Bulma:

İki sayıyı kullanıcıdan alın.
Kullanıcıya hangi işlemi yapmak istediğini sorun (örneğin, toplama veya çıkarma).
Ternary operatörünü kullanarak seçilen işlemi yapın*/
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayıyı girin: ");
        int sayi1 = input.nextInt();

        System.out.print("İkinci sayıyı girin: ");
        int sayi2 = input.nextInt();

        System.out.print("Hangi işlemi yapmak istersiniz? (Toplama için 't', Çıkarma için 'c'): ");
        char islem = input.next().charAt(0);

        int sonuc = (islem == 't') ? sayi1 + sayi2 : (islem == 'c') ? sayi1 - sayi2 : 0;

        System.out.println("Sonuç: " + sonuc);
    }
}





