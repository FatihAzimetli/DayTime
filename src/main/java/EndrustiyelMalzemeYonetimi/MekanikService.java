package EndrustiyelMalzemeYonetimi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MekanikService implements ProductService{
    public Scanner input = new Scanner(System.in);
    //Mekanik Ürünleri Kaydetmek icin Liste
    public List<Mekanik> mekanikList = new ArrayList<>();

    //sistem baslangicinda örnek bir ürün koyuyorum test amacli

    public MekanikService(){
        Mekanik mekanik1= new Mekanik("Cekici", 2,
                "Al Kalip", "A123","Adet"
                ,"Montaj/BodySide","DC0001M5");
        mekanikList.add(mekanik1);


    }
    @Override
    public void processMenu() {
        int choice; //secimini yap
        do {
            System.out.println("----------------------------------------------------");
            System.out.println("1-Mekanik stoklari listele");
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


