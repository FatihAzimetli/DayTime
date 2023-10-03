package BookStore;
/*Proje: Mini Book Store
        Online bir kitap market için ürün yönetim uygulaması yapınız.
        Kitap markette kitap ve defter satışı olacak, ancak ileride yeni ürün çeşidi eklenebilir olmalı.

        Kitap özellikleri: id, isim, birim fiyat, stok, yazar adı, yayınevi,isbn no
        Defter özellikleri: id, isim, birim fiyat, stok, marka, yaprak sayısı,ürün kodu

        Kullanıcı ilgili kategorideki ürünleri listeleyebilmeli
        Kullanıcı kategoriye göre ürün ekleyebilmeli,ürün mevcutsa uyarı verilmeli
        Kullanıcı ürünleri benzersiz numaralarına(id) göre silebilmeli.
        Kullanıcı ürünleri marka(defter)  veya yayınevine(kitap) göre filtreleyip listeleyebilmeli */
public class Product {//ürün islemleri sayfasi
    //Buraya ürün ekleme icin bir sayac konulur
    private static int counter=1; // bu sayac Id icin otomatik yazmasi icin olusturuldu
    private int productId;
    private String productName;
    private double unitPrice;
    private int productStock;



    public Product(String productName, double unitPrice, int productStock) {
        this.productId = counter ++;
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.productStock = productStock;
    }


    public int getProductId() {
        return productId;
    }



    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getProductStock() {
        return productStock;
    }

    public void setProductStock(int productStock) {
        this.productStock = productStock;
    }
}
