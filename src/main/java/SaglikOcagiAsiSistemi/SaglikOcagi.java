package SaglikOcagiAsiSistemi;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SaglikOcagi {
    private List<Asi> asilar;
    private List<Randevu> randevular;
    private int gunlukAsiSayisi;

    private static final int MINIMUM_RANDEVU_ARALIGI = 15; // Dakika cinsinden
    private static final int GUNLUK_RANDEVU_SAYISI = 5;

    public SaglikOcagi() {
        this.asilar = new ArrayList<>();
        this.randevular = new ArrayList<>();
        this.gunlukAsiSayisi = 0;
    }

    public void asiEkle(Asi asi) {
        asilar.add(asi);
    }
    public Date otomatikRandevuAl(Asi asi) {
        if (gunlukAsiSayisi < GUNLUK_RANDEVU_SAYISI) {
            // Otomatik randevu saati oluştur
            Date randevuTarihi = new Date(); // Şu anki tarih ve saat
            gunlukAsiSayisiniGuncelle(1);
            return randevuTarihi;
        } else {
            return null; // Günlük randevu sınırına ulaşıldı
        }
    }

    public void randevuAl(String ad, Asi asi, Date tarih) {
        LocalDateTime tarihLocal = LocalDateTime.ofInstant(tarih.toInstant(), ZoneId.systemDefault());

        int ayniGunRandevuSayisi = (int) randevular.stream()
                .filter(r -> {
                    LocalDateTime randevuLocal = LocalDateTime.ofInstant(r.getTarih().toInstant(), ZoneId.systemDefault());
                    return randevuLocal.toLocalDate().isEqual(tarihLocal.toLocalDate())
                            && randevuLocal.getHour() == tarihLocal.getHour()
                            && randevuLocal.getMinute() == tarihLocal.getMinute();
                })
                .count();

        if (ayniGunRandevuSayisi < 5 && kontrolMinimumRandevuAraligi(tarih)) {
            Randevu randevu = new Randevu(ad, asi, tarih);
            randevular.add(randevu);
            gunlukAsiSayisiniGuncelle(1);
            System.out.println("Randevu alindi " + randevu.getAd() + "-" + randevu.getAsi().getAd() + "-" + randevu.getTarih());
        } else {
            System.out.println("Günlük randevu sinirina ulasildi veya minimum randevu aralığına uymuyor. Lütfen baska bir tarih seciniz.");
        }
    }

    private boolean kontrolMinimumRandevuAraligi(Date yeniTarih) {
        if (randevular.isEmpty()) {
            return true;
        }

        Date sonRandevuTarihi = randevular.get(randevular.size() - 1).getTarih();
        long fark = (yeniTarih.getTime() - sonRandevuTarihi.getTime()) / (60 * 1000);

        return fark >= MINIMUM_RANDEVU_ARALIGI;
    }

    public void gunlukAsiSayisiniGuncelle(int eklenenAsiSayisi) {
        gunlukAsiSayisi += eklenenAsiSayisi;
    }
}

