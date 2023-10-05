package EndrustiyelMalzemeYonetimi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StationaryService implements ProductService{
    public Scanner input = new Scanner(System.in);

    //ürünleri saklama listesi olusturma
    public List<Stationary> stationaryList = new ArrayList<>();

    // baslangic icin 1 adet ürün kaydi
    public StationaryService(){
        Stationary stationary1 = new Stationary("Toner", 2,
                "PalaKitasiye", "HP3456","Adet",
                "Ofisler","T1212");
    }
    @Override
    public void processMenu() {

    }

    @Override
    public void listProducts() {

    }

    @Override
    public void addProduct(Product product) {

    }

    @Override
    public void deleteProduct(int productId) {

    }

    @Override
    public void filterProducts(String filter) {

    }
}
