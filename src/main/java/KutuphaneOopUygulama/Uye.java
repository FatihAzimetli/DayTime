package KutuphaneOopUygulama;

import java.util.ArrayList;
import java.util.List;

public class Uye {
    //uye ozellikleri ve methodlari
    private String ad;
    private String adres;
    private List<Kitap> oduncKitaplar;
    public Uye (String ad, String adres){
        this.ad =ad;
        this.adres = adres;
        this.oduncKitaplar = new ArrayList<>();
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

    public List<Kitap> getOduncKitaplar() {
        return oduncKitaplar;
    }

    public void setOduncKitaplar(List<Kitap> oduncKitaplar) {
        this.oduncKitaplar = oduncKitaplar;
    }
}
