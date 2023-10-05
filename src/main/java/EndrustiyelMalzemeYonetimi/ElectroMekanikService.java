package EndrustiyelMalzemeYonetimi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElectroMekanikService implements ProductService{
    public Scanner input = new Scanner(System.in);
    //elelkromekanik ürünleri saklama listesi
    public List<ElectroMekanik> electroMekanikList = new ArrayList<>();

    //1 adet baslangic ürünü ekleme
    public ElectroMekanikService(){
        ElectroMekanik electroMekanik1= new ElectroMekanik("Start Buton Yesil", 5,
                "Legrand","SBBY101","Adet",
                "Pres/BodySide/Montaj/DyeHouse","EB23Tk");
        electroMekanikList.add(electroMekanik1);
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



