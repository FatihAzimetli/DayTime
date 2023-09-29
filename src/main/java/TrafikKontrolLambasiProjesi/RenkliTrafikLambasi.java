package TrafikKontrolLambasiProjesi;

import java.util.Timer;
import java.util.TimerTask;


public class RenkliTrafikLambasi extends TrafikLambasi {
    private Timer timer;
    private int sure; // Her lamba renginin gösterme süresi (saniye)
    private Renk siradakiRenk; // Sıradaki lambayı belirlemek için enum kullanıyoruz

    // Renkleri temsil eden bir enum oluşturuyoruz
    private enum Renk {
        SARI,
        KIRMIZI,
        YESIL
    }

    public RenkliTrafikLambasi(String rengi, int sure) {
        super(rengi);
        this.sure = sure;
        this.siradakiRenk = Renk.SARI; // İlk sıradaki renk sarı
    }

    public void baslat() {
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                yan();
                try {
                    Thread.sleep(sure * 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                yan();
                if (siradakiRenk == Renk.SARI) {
                    siradakiRenk = Renk.KIRMIZI;
                } else if (siradakiRenk == Renk.KIRMIZI) {
                    siradakiRenk = Renk.SARI;
                } else if (siradakiRenk == Renk.YESIL) {
                    siradakiRenk = Renk.SARI;
                }
            }
        }, 0, sure * 1000 * 2); // İki katı süre ile sıradaki lambaya geç
    }

    public void durdur() {
        if (timer != null) {
            timer.cancel();
            timer = null;
        }
    }
}