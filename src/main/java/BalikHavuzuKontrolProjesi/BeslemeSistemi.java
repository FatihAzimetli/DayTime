package BalikHavuzuKontrolProjesi;

import java.util.Timer;
import java.util.TimerTask;

public class BeslemeSistemi {
    private Timer timer;

    public BeslemeSistemi() {
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                // Yem verme işlemi her 3 saatte bir yapılır
                System.out.println("Yem verme işlemi başladı.");
                baliklaraYemVer();
            }
        }, 0, 3 * 60 * 60 * 1000); // 3 saatte bir tekrarlar
    }

    private void baliklaraYemVer() {
        // Burada balık havuzundaki her bir balığa yem verme işlemi yapılabilir
        // Örnek olarak iki balık ekleyelim:
        Balik balik1 = new Balik("Alabalık1");
        Balik balik2 = new Balik("Alabalık2");

        balik1.yemVer();
        balik2.yemVer();
    }

    public void durdur() {
        timer.cancel();
        System.out.println("Besleme sistemi durduruldu.");
    }
}