package Pratice1008;

public class C02Ortalama {
    public static void main(String[] args) {

        /*double num1 = 23.4;
        * double num2 = 24;
        * double num3 = 12;
        * double num4 = 450.3;
        *double num5 = 100;
        * Bu sayilarin ortalamasini hesaplayan kodu yazin
        * tüm sayilari topla , sayi adedine böl */

        double num1 = 23.4;
         double num2 = 24;
        double num3 = 12;
         double num4 = 450.3;
        double num5 = 100;

        double toplam = num1+num2+num3+num4+num5;
        System.out.println("toplam = " + toplam);
        double ortalama = toplam/5;
        System.out.println("ortalama = " + ortalama);


    }
}
