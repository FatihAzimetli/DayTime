package BalikHavuzuKontrolProjesi;

import java.util.Timer;
import java.util.TimerTask;

public class BalikHavuzuProjesi {
    public static void main(String[] args) {
        BalikHavuzuProjesi proje = new BalikHavuzuProjesi();
        proje.baslat();
    }

    public void baslat() {
        BeslemeSistemi beslemeSistemi = new BeslemeSistemi();
        HavaKontrol havaKontrol = new HavaKontrol();

        // Örnek olarak hava koşulları her saat kontrol edilir
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                havaKontrol.kotrolEt();
            }
        }, 0, 60 * 60 * 1000); // 1 saatte bir tekrarlar

        // Örnek olarak kullanıcı ışığı kapattığını söylerse
        Balik balik = new Balik("Alabalık1");
        balik.kapat();

        // Örnek olarak kullanıcı ışığı açtığını söylerse
        balik.ac();
    }
}
