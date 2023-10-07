package EndrustiyelMalzemeYonetimi;

public interface ProductService {
    //Sürec menusu
    void processMenu();


    // Ürünleri listeleme
    void listProducts();

    // Ürün ekleme
    void addProduct();


    // Ürünü listeden silme
    void deleteProduct();


    // Ürünleri filtreleme
    void filterProducts(String filter);


}



