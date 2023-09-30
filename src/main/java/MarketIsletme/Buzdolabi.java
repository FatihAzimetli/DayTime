package MarketIsletme;

public class Buzdolabi extends BeyazEsya {
    private int kapasiteLitre;

    public Buzdolabi(String marka, String ureticiAdi, int satisNumarasi, double fiyat, int kapasiteLitre) {
        super("Buzdolabi", fiyat, marka, ureticiAdi, satisNumarasi);
        this.kapasiteLitre = kapasiteLitre;
    }

    public int getKapasiteLitre() {
        return kapasiteLitre;
    }

    public void setKapasiteLitre(int kapasiteLitre) {
        this.kapasiteLitre = kapasiteLitre;
    }

    @Override
    public String toString() {
        return super.toString()+ ureticiAdi + " satis numarsi " + satisNumarsi + " - Kapasite Litre: " + kapasiteLitre;
    }
}


