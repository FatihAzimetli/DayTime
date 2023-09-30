package MarketIsletme;

import java.util.Scanner;

public class SatisSayfasi {
    public static void main(String[] args) {
        // Marketi oluştur
        Market market = new Market("Yeni Market", "Istanbul");

        // Ürünleri oluştur
        Urun firin = new Urun("Firin", 300.0, "Arcelik", 1);
        Urun buzdolabi = new Urun("Buzdolabi", 600.0, "Beko", 2);
        Urun camasirMakinasi = new Urun("Camasir Makinesi", 200.0, "Samsung", 3);

        // Ürünleri markete ekle
        market.urunEkle(firin);
        market.urunEkle(buzdolabi);
        market.urunEkle(camasirMakinasi);

        // Kullanıcıdan alışveriş yapmasını iste
        alisverisYap(market);
    }

    public static void alisverisYap(Market market) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Kullanıcıya mevcut ürünleri göster
            market.urunleriListele();
            System.out.println("----XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX-------");
            // Kullanıcıdan ürün seçmesini iste
            System.out.print("Satın almak istediğiniz ürünün adını girin (Çıkış için 'exit' yazın): ");
            String urunAdi = scanner.next();

            if (urunAdi.equalsIgnoreCase("exit")) {
                System.out.println("Alışverişten çıkılıyor. İyi günler!");
                break;
            }

            // Kullanıcıdan kaç adet almak istediğini iste
            System.out.print("Kaç adet satın almak istiyorsunuz? ");
            int adet = scanner.nextInt();

            // Seçilen ürünü marketten satın al
            Urun secilenUrun = market.urunBul(urunAdi);
            if (secilenUrun != null) {
                market.urunSatinAl(secilenUrun, adet);
            } else {
                System.out.println("Belirtilen isimde bir ürün bulunamadı. Lütfen geçerli bir ürün adı girin.");
                System.out.println("-----XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX------");
            }
        }

        scanner.close();
    }
}


