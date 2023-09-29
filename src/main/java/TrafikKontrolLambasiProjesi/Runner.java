package TrafikKontrolLambasiProjesi;

import java.util.Timer;
import java.util.TimerTask;

public class Runner {
    public static void main(String[] args) {
        RenkliTrafikLambasi kirmiziLamba = new RenkliTrafikLambasi("Kirmizi", 7); // 15 saniye kırmızı kalır
        RenkliTrafikLambasi sariLamba = new RenkliTrafikLambasi("Sari", 3);     // 5 saniye sarı kalır
        RenkliTrafikLambasi yesilLamba = new RenkliTrafikLambasi("Yesil", 7);   // 35 saniye yesil kalır

        Timer timer = new Timer();
        int toplamSure = 0;

        while (true) {
            kirmiziLamba.baslat();
            System.out.println("Kırmızı lamba yandı.");
            try {
                Thread.sleep(15000); // 15 saniye bekle
                toplamSure += 15;
                kirmiziLamba.durdur();
                System.out.println("Kırmızı lamba durdu.");

                if (toplamSure >= 60) {
                    toplamSure = 0;
                    sariLamba.baslat();
                    System.out.println("Sarı lamba yandı.");
                    Thread.sleep(5000); // 5 saniye bekle
                    sariLamba.durdur();
                    System.out.println("Sarı lamba durdu.");
                }

                toplamSure += 5;

                yesilLamba.baslat();
                System.out.println("Yeşil lamba yandı.");
                Thread.sleep(35000); // 35 saniye bekle
                toplamSure += 35;
                yesilLamba.durdur();
                System.out.println("Yeşil lamba durdu.");

                if (toplamSure >= 60) {
                    toplamSure = 0;
                    sariLamba.baslat();
                    System.out.println("Sarı lamba yandı.");
                    Thread.sleep(5000); // 5 saniye bekle
                    sariLamba.durdur();
                    System.out.println("Sarı lamba durdu.");
                }

                toplamSure += 5;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}