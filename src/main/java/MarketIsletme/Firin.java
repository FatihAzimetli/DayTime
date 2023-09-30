package MarketIsletme;

public class Firin extends BeyazEsya {
    private String isitmaTipi;

    public Firin(String marka, String ureticiAdi, int satisNumarasi, double fiyat, String isitmaTipi) {
        super("Firin", fiyat, marka, ureticiAdi, satisNumarasi);
        this.isitmaTipi = isitmaTipi;
    }

    public String getIsitmaTipi() {
        return isitmaTipi;
    }

    public void setIsitmaTipi(String isitmaTipi) {
        this.isitmaTipi = isitmaTipi;
    }

    @Override
    public String toString() {
        return super.toString() + ureticiAdi + " satis numarsi " + satisNumarsi + " - Isitma Tipi: " + isitmaTipi;
    }


}

