package KutuphaneOopUygulama;

import java.util.ArrayList;
import java.util.List;

public class Kutuphane {
    private List<Kitap> kitaplar;
    private List<Uye> uyeler;
    public Kutuphane(){
        this.kitaplar = new ArrayList<>();
        this.uyeler = new ArrayList<>();
    }

    public List<Kitap> getKitaplar() {
        return kitaplar;
    }

    public void setKitaplar(List<Kitap> kitaplar) {
        this.kitaplar = kitaplar;
    }

    public List<Uye> getUyeler() {
        return uyeler;
    }

    public void setUyeler(List<Uye> uyeler) {
        this.uyeler = uyeler;
    }
}
