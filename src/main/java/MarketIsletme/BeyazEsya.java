package MarketIsletme;

class BeyazEsya extends Urun {
    String ureticiAdi;
    protected int satisNumarsi;
    private String adi;

    public BeyazEsya(String ad, double fiyat, String ureticiAdi, String adi, int satisNumarasi) {
        super(ad, fiyat, ureticiAdi, satisNumarasi);
        this.ureticiAdi = ureticiAdi;
        this.satisNumarsi = satisNumarasi;
        this.adi = adi;
    }

    @Override
    public String toString() {
        return super.toString() + " - Üretici Adı: " + ureticiAdi + " - Satış Numarası: " + satisNumarsi + " - Adı: " + adi;
    }

    @Override
    public String getUreticiAdi() {
        return ureticiAdi;
    }

    @Override
    public void setUreticiAdi(String ureticiAdi) {
        this.ureticiAdi = ureticiAdi;
    }

    @Override
    public int getSatisNumarasi() {
        return satisNumarsi;
    }

    @Override
    public void setSatisNumarasi(int satisNumarasi) {
        this.satisNumarsi = satisNumarasi;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }
}














