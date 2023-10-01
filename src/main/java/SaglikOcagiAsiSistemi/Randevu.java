package SaglikOcagiAsiSistemi;

import java.util.Date;

public class Randevu { //adim3
    private String ad;
    private Asi asi;
    private Date tarih;

    public Randevu(String ad, Asi asi, Date tarih) {
        this.ad = ad;
        this.asi = asi;
        this.tarih = tarih;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public Asi getAsi() {
        return asi;
    }

    public void setAsi(Asi asi) {
        this.asi = asi;
    }

    public Date getTarih() {
        return tarih;
    }

    public void setTarih(Date tarih) {
        this.tarih = tarih;
    }
}


