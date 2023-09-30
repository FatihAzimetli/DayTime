package MarketIsletme;

public class Urun {
    private String ad;
    private double fiyat;
    private String ureticiAdi;
    private int satisNumarasi;

    public Urun(String ad, double fiyat, String ureticiAdi, int satisNumarasi) {
        this.ad = ad;
        this.fiyat = fiyat;
        this.ureticiAdi = ureticiAdi;
        this.satisNumarasi = satisNumarasi;
    }

    @Override
    public String toString() {
        return ad + " - Fiyat: " + fiyat + " TL - Üretici Adı: " + ureticiAdi + " - Satış Numarası: " + satisNumarasi;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public String getUreticiAdi() {
        return ureticiAdi;
    }

    public void setUreticiAdi(String ureticiAdi) {
        this.ureticiAdi = ureticiAdi;
    }

    public int getSatisNumarasi() {
        return satisNumarasi;
    }

    public void setSatisNumarasi(int satisNumarasi) {
        this.satisNumarasi = satisNumarasi;
    }
}


