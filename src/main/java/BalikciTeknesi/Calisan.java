package BalikciTeknesi;

public class Calisan {
    private String ad;
    private String pozisyon;
    public Calisan (String ad, String pozisyon){
        this.ad =ad;
        this.pozisyon =pozisyon;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getPozisyon() {
        return pozisyon;
    }

    public void setPozisyon(String pozisyon) {
        this.pozisyon = pozisyon;
    }
}
