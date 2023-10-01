package SaglikOcagiAsiSistemi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SaglikOcagiApp { //adim 1
    private static final int GUNLUK_RANDEVU_SAYISI = 5;

    public static void main(String[] args) {
        //uygulama baslatilacak kodlar buraya gelecek 7.nci adim
        SaglikOcagi saglikOcagi = new SaglikOcagi();
        Asi covidAsi = new Asi("Covid Asi", 5);
        saglikOcagi.asiEkle(covidAsi);

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < GUNLUK_RANDEVU_SAYISI; i++) {
            System.out.println("Randevu almak için aşağıdaki formu doldurunuz:");

            System.out.print("Adınız: ");
            String ad = scanner.nextLine();

            System.out.print("Soyadınız: ");
            String soyad = scanner.nextLine();

            Date randevuTarihi = saglikOcagi.otomatikRandevuAl(covidAsi);

            if (randevuTarihi != null) {
                System.out.println("Randevu alındı! " + ad + " " + soyad + ", " + covidAsi.getAd() + " aşısı için " + randevuTarihi + " tarihinde.");
            } else {
                System.out.println("Günlük randevu sınırına ulaşıldı. Başka bir gün deneyin.");
                break;
            }
        }

        System.out.println("Günlük randevu sınırları doldu. İyi günler!");
        scanner.close();
    }
}


