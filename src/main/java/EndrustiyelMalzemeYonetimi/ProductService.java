package EndrustiyelMalzemeYonetimi;

public interface ProductService {
    //Sürec menusu
    void processMenu();


    // Ürünleri listeleme
    void listProducts();

    // Ürün ekleme
    void addProduct(Product product);


    // Ürünü listeden silme
    void deleteProduct(int productId);


    // Ürünleri filtreleme
    void filterProducts(String filter);


}
