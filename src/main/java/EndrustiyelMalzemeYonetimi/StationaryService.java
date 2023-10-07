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
        this.stationaryList.add(stationary1);
    }
    @Override
    public void processMenu() {
        int choice; //secimini yap
        do {
            System.out.println("---------------------------------------------");
            System.out.println("1-Kirtasiye stoklari listele");
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
    public void addProduct() {

    }

    @Override
    public void deleteProduct() {

    }

    @Override
    public void filterProducts(String filter) {

    }
}
