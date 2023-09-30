package MarketIsletme;

import java.util.ArrayList;
import java.util.List;

public class Market {
    private String ad;
    private String adres;
    private String ureticiAdi;
    private  int satisNumarasi;
    private List<Urun> urunler;

    public Market(String ad, String adres) {
        this.ad = ad;
        this.adres = adres;
        this.urunler = new ArrayList<>();
    }

    public void urunEkle(Urun urun) {
        urunler.add(urun);
        System.out.println(urun.getAd() + " Markete eklendi");
    }

    public void urunleriListele() {
        System.out.println("Market ürünleri:");
        for (Urun urun : urunler) {
            System.out.println(urun.toString());
        }
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public List<Urun> getUrunler() {
        return urunler;
    }

    public void setUrunler(List<Urun> urunler) {
        this.urunler = urunler;
    }

}


