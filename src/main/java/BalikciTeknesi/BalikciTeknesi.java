package BalikciTeknesi;

import java.util.ArrayList;
import java.util.List;

public class BalikciTeknesi {
    private String ad;
    private List<Calisan> calisanlar;
    private List<Balik> yakalananBaliklar;
    private  List<Paket> paketleme ;

    public BalikciTeknesi (String ad){
        this.ad = ad;
        this.calisanlar =new ArrayList<>();
        this.yakalananBaliklar = new ArrayList<>();
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public List<Calisan> getCalisanlar() {
        return calisanlar;
    }

    public void setCalisanlar(List<Calisan> calisanlar) {
        this.calisanlar = calisanlar;
    }

    public List<Balik> getYakalananBaliklar() {
        return yakalananBaliklar;
    }

    public void setYakalananBaliklar(List<Balik> yakalananBaliklar) {
        this.yakalananBaliklar = yakalananBaliklar;
    }

    public List<Paket> getPaketleme() {
        return paketleme;
    }

    public void setPaketleme(List<Paket> paketleme) {
        this.paketleme = paketleme;
    }
}
