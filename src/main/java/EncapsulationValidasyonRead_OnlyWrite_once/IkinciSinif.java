package EncapsulationValidasyonRead_OnlyWrite_once;

public class IkinciSinif {
    private String Okuma;
    private String Yazma;
    private int Odeme;

    //Setterlar

    public void setOkuma(String okuma) {
        Okuma = okuma;
    }

    public void setYazma(String yazma) {
        Yazma = yazma;
    }

    public void setOdeme(int odeme) {
        Odeme = odeme;
    }

    //getter lar

    public String getOkuma() {
        return Okuma;
    }

    public String getYazma() {
        return Yazma;
    }

    public int getOdeme() {
        return Odeme;
    }
}
