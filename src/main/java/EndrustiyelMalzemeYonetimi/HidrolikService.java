package EndrustiyelMalzemeYonetimi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HidrolikService implements ProductService{
    public Scanner input = new Scanner(System.in);
    //hidrolik ürünleri saklama listesi
    public List<Hidrolik> hidrolikList =new ArrayList<>();

    //baslangic icin 1 adet ürün ekliyorum
    public HidrolikService(){
        Hidrolik hidrolik1 = new Hidrolik("5yolluWalf",2,
                "Festo","H5W2INP3AUP","Adet",
                "Pres/Kaynak/Montaj","A1234");
        hidrolikList.add(hidrolik1);
    }
    @Override
    public void processMenu() {
        int choice; //secimini yap
        do {
            System.out.println("__________________________________________________");
            System.out.println("1-Hidrolik ve Pimomatik stoklari listele");
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



