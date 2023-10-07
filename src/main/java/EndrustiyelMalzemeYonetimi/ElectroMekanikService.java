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
        int choice; //secimini yap
        do {
            System.out.println("______________-------------------------------");
            System.out.println("1-ElelktoMekanik stoklari listele");
            System.out.println("2-Stok'a Ürün ekle");
            System.out.println("3-Stogu sil");
            System.out.println("4-Üreticiye göre filtrele");
            System.out.println("0- Geriye dön");
            System.out.println("Seciminiz");
            choice = input.nextInt();
            input.nextLine();//Bos satira gecmemesi icin bu metod yazilir.

        }while (choice != 0);//0 secmedigi sürece döngüyü tekrar et

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



