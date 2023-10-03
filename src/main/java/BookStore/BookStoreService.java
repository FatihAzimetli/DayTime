package BookStore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Kitaplarla yapilabilecek islemler burada tutulacak
public class BookStoreService implements ProductService{
    public Scanner input = new Scanner(System.in);

    //Kitaplari ve ürünleri saklamak icin list olusturuyoruz
    public List<BookStore> bookStoreslist = new ArrayList<>();

    // sistemin baslanginda örnek 1 adet kitap ekleriz uygulamayi test edebilmek icin
    public BookStoreService(){
        BookStore book1 = new BookStore("MaviBalik",
                100, 3,"Kaba Baba",
                "Kizilboru", "as111");
        BookStore book2 = new BookStore("miniBalik",
                50, 3,"Kaba Mama",
                "SiyahDuman", "bb123");
        BookStore book3 = new BookStore("yetimBalik",
                10, 3,"Kaba Baby",
                "Davulcu", "d234");
        this.bookStoreslist.add(book1);
        this.bookStoreslist.add(book2);
        this.bookStoreslist.add(book3);
    }

    //proses menu : islem secim menusu //Burada while ya do while menusu yapmak gerekiyor
    @Override
    public void processMenu() {// burada kitap eklemeli veya görüntülemeli yada silmeli yada filtre yapabilmeli
        int choise; //choise : secmek
        do {
            System.out.println("-------------------------------------------------------");
            System.out.println("1- Tüm kitaplari listele");
            System.out.println("2- yeni Kitap ekle");
            System.out.println("3- Kitabi sil");
            System.out.println("4- Yayinevine göre kitaplari Filtrele");
            System.out.println("0- Ana sayfaya dön");
            System.out.println("Seciminiz");
            choise = input.nextInt();
            input.nextLine();
            switch (choise){
                case 1:
                    listProduct();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    deleteProduct();
                    break;
                case 4:
                    System.out.println("Yayinevi :");
                    String publisherHous= input.nextLine();
                    filterProduct(publisherHous);
                    break;
                case 0:
                    System.out.println("Ana menüye yönlendiriliyorsunuz");
                    break;
                default:
                    System.out.println("Hatali giris !");
                    break;
            }
        }while (choise !=0);//chose 0 olmadigi sürece tekrar tekrar göster


    }
    //Kitaplari listele

    @Override
    public void listProduct() {
        System.out.println("-------------------------------------------------------------------------");
        System.out.printf("%-5s | %-20s | %-15s | %-10s | %-6s | %10-s | %6-s | \n",
                "ID","Kitap Adi","Yazar Adi","Yayinevi","ISBN","Birim Fiyat","Stok Bil");
        System.out.println("-------------------------------------------------------------------------");
        this.bookStoreslist.forEach(bookStore -> System.out.printf("%-5s | %-20s " +
                        "| %-15s | %-10s | %-6s | %10-s | %6-s | \n"
                ,bookStore.getProductId(),bookStore.getProductName()
                ,bookStore.getWriterName(),bookStore.getProductId()
                ,bookStore.getIsbnNo(),bookStore.getUnitPrice()+"Lira",
                bookStore.getProductStock()));
        System.out.println("----------------------------------------------------------------------------");

    }
    //Yeni kitap girisi yapmak

    @Override
    public void addProduct() {
        System.out.println("ISBN : ");
        String isbn = input.nextLine();
        boolean isExists = false;
        for (BookStore bookStore: this.bookStoreslist){
            if (bookStore.getIsbnNo().equals(isbn)){
                System.out.println("Bu kitap sistemde kayitli, Lütfen ürün güncelleme yapiniz"); // Stok güncelleme ödev
                isExists = true;
                break;
            }
        }
        if (!isExists){
            System.out.println("Kitap adi :");
            String name = input.nextLine();
            System.out.println("Yazar adi :");
            String author = input.nextLine();
            System.out.println("Yayin evi :");
            String publisher = input.nextLine();
            System.out.println("Birim fiyat");
            double price= input.nextDouble();
            System.out.println("Stok :");
            int stoct = input.nextInt();
            input.nextLine();
            BookStore newbookStore=  new BookStore(name,price,stoct,author,publisher,isbn);
            this.bookStoreslist.add(newbookStore);


        }
        listProduct();

    }
//ürün silmeyi id ile yapacagiz.
    @Override
    public void deleteProduct() {

    }

    @Override
    public void filterProduct(String filter) {

    }
}
