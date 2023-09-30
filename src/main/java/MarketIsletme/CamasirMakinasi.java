package MarketIsletme;

public class CamasirMakinasi extends BeyazEsya {
    private int yikamaKapasitesiKg;

    public CamasirMakinasi(String marka, String ureticiAdi, int satisNumarasi, double fiyat, int yikamaKapasitesiKg) {
        super("Çamaşır Makinesi", fiyat, marka, ureticiAdi, satisNumarasi);
        this.yikamaKapasitesiKg = yikamaKapasitesiKg;
    }



    public int getYikamaKapasitesiKg() {
        return yikamaKapasitesiKg;
    }

    public void setYikamaKapasitesiKg(int yikamaKapasitesiKg) {
        this.yikamaKapasitesiKg = yikamaKapasitesiKg;
    }

    @Override
    public String toString() {
        return super.toString() + ureticiAdi + " satis numarsi " + satisNumarsi + " - Yikama Kapasitesi: " + yikamaKapasitesiKg ;
    }
}









