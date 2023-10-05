package EndrustiyelMalzemeYonetimi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WeldigService implements ProductService{

public Scanner input = new Scanner(System.in);
//Weldin ürünleri saklama listesi
    public List<Welding> weldingList = new ArrayList<>();

    //sistem baslangici icin örnek bir ürün
    public WeldigService(){
        Welding welding1 = new Welding("0,5mm Torc ucu", 10,
                "AsaKaynak","05mmTU","Adet",
                "BodySide","TU12333");
        weldingList.add(welding1);
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


