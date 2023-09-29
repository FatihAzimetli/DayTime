package EncapsulationValidasyonRead_OnlyWrite_once;

public class AnaSinif {
    private String ad;
    private int yas;
    private String okuma;
    private String yazma;
    private int odeme;
    //getir metodlari ekle


    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getOkuma() {
        return okuma;
    }

    public void setOkuma(String okuma) {
        this.okuma = okuma;
    }

    public String getYazma() {
        return yazma;
    }

    public void setYazma(String yazma) {
        this.yazma = yazma;
    }

    public int getOdeme() {
        return odeme;
    }

    public void setOdeme(int odeme) {
        this.odeme = odeme;
    }
}

