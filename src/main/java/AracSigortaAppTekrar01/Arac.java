package AracSigortaAppTekrar01;
//klaslar objelerin özelliklerini tasir. Isimleri , tipleri, sekilleri, boyurlari , standlari gibi özellikleri olmalidir
// Tarife dönemi            ; Aralik 2023,                    Haziran 2023
   //     *        1. dönem : Haziran 2023                   2. Dönem : Aralik 2023
   //     *        Otomobil ; 2000                            Otomobil . 2500
    //    *        Kamyon   ; 3000                              Kamyon : 3500
     //   *     Otobüs Tip1 ; 4000 tip2 ; 5000                  Otobus ; Tip1 4500  Tip2 : 5500
    //    *       Motosiklet: 1500                          Motosiklet : 1750

import java.util.Scanner;

//
public class Arac {
    public String type;
    public int prim;

    public void countPrim(int period) {
        switch (this.type) {
            case "Otomobil":
                this.prim = period == 1 ? 2000 : 2500;
                break;
            case "Kamyon":
                this.prim = period == 1 ? 3000 : 3500;
                break;
            case "Otobus":
                countBusPrim(period);
                break;
            case "Motosiklet":
                this.prim = period == 1 ? 1500 : 1750;
                break;
            default:
                System.out.println("Hatali giris");
                this.prim = 0;
                break;
        }
    }

    public void countBusPrim(int period) {
        Scanner input = new Scanner(System.in);
        System.out.println("Otobüs tipini seciniz");
        System.out.println("1. 18-30 Koltuk arasi");
        System.out.println("2. 31 koltuk ve üzeri");
        int busType = input.nextInt();

        switch (busType) {
            case 1:
                this.prim = period == 1 ? 4000 : 4500;
                break;
            case 2:
                this.prim = period == 1 ? 5000 : 5500;
                break;
            default:
                System.out.println("Hatali giris");
                this.prim = 0;
                break;
        }
    }
}
