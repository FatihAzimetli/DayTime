package BalikciTeknesi;

public class Balik {
    private String tur;
    private double agirlik;
    public Balik (String tur, double agirlik){
        this.tur = tur;
        this.agirlik = agirlik;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public double getAgirlik() {
        return agirlik;
    }

    public void setAgirlik(double agirlik) {
        this.agirlik = agirlik;
    }
}
