package EndrustiyelMalzemeYonetimi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DiningHallService implements ProductService{
    //Kullanici bilgilerinin girisi icin
    public Scanner input = new Scanner(System.in);

    //Ürünleri saklama listesi
    public List<DiningHall> diningHallList = new ArrayList<>();



    public DiningHallService(){
//sisteme öremk bir ürün girisi,Bunun icin o clasin servisinden parametresiz konjacter olustururuz

        DiningHall diningHall1= new DiningHall("Mercimek", 200,
                "Yesil", "K120","Kg","YEMEKHANE","KM111");
        this.diningHallList.add(diningHall1);
    }

    //proses mesününde islem secim gösterilecek burada proses icin while veya do while metodu kullanilir do while tercih edildi.
    @Override
    public void processMenu() {
        int choice; //secimini yap
        do {
            System.out.println("---------------------------------------------------------");
            System.out.println("1-DiningHall stoklari listele");
            System.out.println("2-Stok'a Ürün ekle");
            System.out.println("3-Stogu sil");
            System.out.println("4-Üreticiye göre filtrele");
            System.out.println("0- Geriye dön");
            System.out.println("Seciminiz");
            choice = input.nextInt();
            input.nextLine();//Bos satira gecmemesi icin bu metod yazilir.
            //kullanicinin sunulan menu icin kontrol verilir bunun icin switch kullaniriz

            switch (choice){
                case 1:
                    listProducts();
                    break;
                case 2:
                    System.out.println("Ürün ekle");
                    addProduct();
                    break;
                case 3:
                    System.out.println("Üretici kodu ile sil");
                    String productId = input.nextLine();
                   deleteProduct();
                    break;
                case 4:
                    System.out.println("MeterialName");
                    String materialName= input.nextLine();
                    filterProducts(materialName);
                    break;
                case 0:
                    System.out.println("Ana menüye yönlendiriliyorsunuz");
                    break;
                default:
                    System.out.println("Hatali giris");
                    break;

            }

        }while (choice != 0);//0 secmedigi sürece döngüyü tekrar et

    }
//ürünleri listeleme
    @Override
    public void listProducts() {
        System.out.println("________________________________________________________________");
        System.out.printf("%5s | %20s | %5s | %5s | %12s | %5s | %10s | %5s | \n ","ID","Ürün adi","Stok miktari","Birimi","Üretici Adi","ÜreticiÜrün Kodu","Kullanan Bölüm","Isbn Mo");
        System.out.println("----------------------------------------------------------------");
        this.diningHallList.forEach(diningHall -> System.out.printf("%5s | %20s | %5s | %5s | %12s | %5s | %10s | %5s | \n "
                ,diningHall.getId(),diningHall.getMaterialName(),diningHall.getAmountOfStock(),
                diningHall.getMeasuringUnit(),diningHall.getProductName(),diningHall.getProductCode(),
                diningHall.getUserSection(),diningHall.getIsbnNo()));
        System.out.println("_------------------------------------------------------------------");
    }
//sisteme ürün girisi
    @Override
    public void addProduct() {
        System.out.println("Ürün Adi : ");
        String materialName = input.nextLine();
        boolean isExists = false; // ürün listede varmi.?
        for (DiningHall diningHall:this.diningHallList){
            if (diningHall.getMaterialName().equalsIgnoreCase(materialName)){
                System.out.println("Bu ürün sistemde kayitli, Lütfen ürün güncelleme yap");// stok güncelleme
                isExists = true; //ürünü bulursa
                break;
            }

        }
        //ürün sistemde yoksa
        if (!isExists){
            System.out.println("Kullanici Birim");
            String userSection = input.nextLine();
            System.out.println(" Üretici Adi");
            String productNames = input.nextLine();
            System.out.println("Üretici Ürün Kodu");
            String productCodes = input.nextLine();
            System.out.println("Isbn No : ");
            String isbnNumber = input.nextLine();
            System.out.println("Stok durumu");
            String amountOfStoct = input.nextLine();
            System.out.println("Üretici Kodu");

        }

    }

    @Override
    public void deleteProduct() {

    }

    @Override
    public void filterProducts(String filter) {

    }
}


