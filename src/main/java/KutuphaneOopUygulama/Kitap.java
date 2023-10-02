package KutuphaneOopUygulama;

public class Kitap {
    private String ad;
    private String yazar;
    private boolean oduncAlindi ;
    public Kitap(String ad, String yazar){
        this.ad = ad;
        this.yazar = yazar;
        this.oduncAlindi = false;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public boolean isOduncAlindi() {
        return oduncAlindi;
    }

    public void setOduncAlindi(boolean oduncAlindi) {
        this.oduncAlindi = oduncAlindi;
    }
//Kitap özellikleri ve metodlari
}
