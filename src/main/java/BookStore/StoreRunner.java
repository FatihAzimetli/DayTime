package BookStore;

import java.util.Scanner;

public class StoreRunner {
    public static void main(String[] args) {
        start ();//bu metod varmis gibi basliyoruz ve more action import ediyoruz
    }
    //greate method icindeki 'start' in Runner seciyoruz
    //olusturulan ürünleri kalici olarak hafizada tutmak istiyoruz.
    //bookStore ve NoteBookStore icin servis klaslari olusturma. Amac bakim ve güncelleme icin servisler yapilir
    // servis klaslarinda neler olmali . bunun icin bir interface olusturulur. servis klaslarini interface üzeründen görüntülenir
    //interface klasi bir standart olusturma klasidir
    private static void start() {
        Scanner input = new Scanner(System.in);
        int select;
        //Katagörü menüsü
        //servis klasi olusturmak gerekiyor
        ProductService bookService = new BookStoreService();
        ProductService noteBookService = new NoteBookStoreService();

       do {
           System.out.println("-------Mini Book store ---------");
           System.out.println("Ürün yönetim Paneli");
           System.out.println("1-Kitaplar");
           System.out.println("2-Defterler");
           System.out.println("0-Cikis");
           System.out.println("Seciminiz");
           select = input.nextInt();
           input.nextLine();
           ProductService service= select ==1 ? bookService : noteBookService;
           switch (select){
               case 1: case 2:
                   service.processMenu();
                   //case 2:
                   //bookService.processMenu();
                   break;
               case 0:
                   System.out.println("Sistemden Cikis");
                   break;
               default:
                   System.out.println("Hatali giris");
                   break;
           }


       }while (select !=0);


    }


}



