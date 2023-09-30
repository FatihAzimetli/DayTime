package MarketIsletme;

public class Main {
    public static void main(String[] args) {
        //Market olusturmak
        Market market = new Market("Yeni Market", "Istanbul");

        //Ürün olusturmak
        Urun firin = new Urun("Firin", 300.0, "Arcelik", 1);
        Urun buzdolabi = new Urun("Buzdolabi", 600.0, "Beko", 2);
        Urun camasirMakinasi = new Urun("Camasir Makinesi", 200.0, "Samsung", 3);

        //Ürünleri markete ekle
        market.urunEkle(firin);
        market.urunEkle(buzdolabi);
        market.urunEkle(camasirMakinasi);

        //market ürünlerini listele
        market.urunleriListele();

    }
}


