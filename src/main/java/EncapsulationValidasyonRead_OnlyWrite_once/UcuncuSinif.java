package EncapsulationValidasyonRead_OnlyWrite_once;

public class UcuncuSinif {
    private String ad;
    private int yas;
    private String okuma;
    private String yazma;
    private int odeme;

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




    public void setOkumaYazma(String okuma, String yazma){
        this.okuma = okuma;
        this.yazma = yazma;
    }
    public void setOdeme(int odeme, boolean ucretli){
        this.odeme = ucretli ? odeme :0;

    }
    public String getOkumaYazma(){
        return okuma + " " + yazma;
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
