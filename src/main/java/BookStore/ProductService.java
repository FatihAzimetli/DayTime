package BookStore;
//olusturulan ürünleri kalici olarak hafizada tutmak istiyoruz.
//bookStore ve NoteBookStore icin servis klaslari olusturma. Amac bakim ve güncelleme icin servisler yapilir
// servis klaslarinda neler olmali . bunun icin bir interface olusturulur. servis klaslarini interface üzeründen görüntülenir
//interface klasi bir standart olusturma klasidir
//kitaplari görüntüle
//kitaplari ekle
// kitaplari sil
//kitaplari filtrele
//katagörünün baslamasini main metostta sececegiz  yani 1- Katap bölümü 2- defter bölümü 3- kalem bölümü 4- anamenüye dönüs v.b
// buradaki ilgili katagörü secildikten sonra productService klasina yönlenecek

public interface ProductService {

    void processMenu(); // geriye dönüsleri sagliyacak sürec menüsü

    void listProduct(); // ürünleri listele
    void addProduct(); // ürün eklemek icin

    void deleteProduct(); // ürün silme

    void filterProduct(String filter); // ürünleri filtrele



}



