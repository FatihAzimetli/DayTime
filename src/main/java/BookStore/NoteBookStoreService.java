package BookStore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Defterlerle  ilgili yapilabilecek degisikler bu klasta tutulacak
public class NoteBookStoreService implements ProductService {
    public Scanner input = new Scanner(System.in);
    public List<NoteBookStore> noteBookStoreslist = new ArrayList<>();

    public NoteBookStoreService() {
        NoteBookStore noteBook1 = new NoteBookStore("Ajanda", 5, 5, "Maviler", 25, "a12121");
        this.noteBookStoreslist.add(noteBook1);
    }

    @Override
    public void processMenu() {
        int choise;
        do {
            System.out.println("--------------------------------------------");
            System.out.println("1- Tüm defterleri listele");
            System.out.println("2- Yeni defter ekle");
            System.out.println("3- Defteri sil");
            System.out.println("4- Üreticiye göre defterleri filtrele");
            System.out.println("0- Ana sayfaya dön");
            System.out.println("Seciminiz");
            choise = input.nextInt();
            input.nextLine();
            switch (choise) {
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
                    System.out.println("Üretici :");
                    String producerName = input.nextLine();
                    filterProduct(producerName);
                    break;
                case 0:
                    System.out.println("Ana menüye yönlendiriliyorsunuz");
                    break;
                default:
                    System.out.println("Hatalı giriş!");
                    break;
            }
        } while (choise != 0);
    }

    @Override
    public void listProduct() {
        System.out.println("-------------------------------------------------------------------------");
        System.out.printf("%5s | %6s | %10s | %10s | %6s | %10s | %6s | \n",
                "ID", "Defter Adı", "Üretici", "Stok", "Yaprak Sayısı", "Birim Fiyat", "Stok Bil");
        System.out.println("-------------------------------------------------------------------------");
        this.noteBookStoreslist.forEach(noteBookStore -> System.out.printf("%5s | %20s | %15s | %10s | %6s | %10s | %6s | \n",
                noteBookStore.getProductId(), noteBookStore.getProductName(),
                noteBookStore.getProducerName(), noteBookStore.getProductStock(),
                noteBookStore.getNumberOfSheets(), noteBookStore.getUnitPrice() + " Lira",
                noteBookStore.getProductCode()));
        System.out.println("-------------------------------------------------------------------------");
    }

    @Override
    public void addProduct() {
        System.out.println("Ürün Kodu : ");
        String productCode = input.nextLine();
        boolean isExists = false;
        for (NoteBookStore noteBookStore : this.noteBookStoreslist) {
            if (noteBookStore.getProductCode().equals(productCode)) {
                System.out.println("Bu defter sistemde kayıtlı, Lütfen ürün güncelleme yapınız");
                isExists = true;
                break;
            }
        }
        if (!isExists) {
            System.out.println("Defterin adı :");
            String name = input.nextLine();
            System.out.println("Üretici adı :");
            String producerName = input.nextLine();
            System.out.println("Birim fiyat");
            double price = input.nextDouble();
            System.out.println("Stok :");
            int stock = input.nextInt();
            System.out.println("Yaprak sayısı :");
            int numberOfSheets = input.nextInt();
            input.nextLine();
            NoteBookStore newNoteBookStore = new NoteBookStore(name, price, stock, producerName, numberOfSheets, productCode);
            this.noteBookStoreslist.add(newNoteBookStore);
        }
        listProduct();
    }

    @Override
    public void deleteProduct() {
        boolean isFound = false;
        System.out.println("Defter ID :");
        int id = input.nextInt();
        for (NoteBookStore noteBookStore : this.noteBookStoreslist) {
            if (noteBookStore.getProductId() == id) {
                this.noteBookStoreslist.remove(noteBookStore);
                System.out.println("Ürün silindi. ");
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            System.out.println("Ürün bulunamadı");
        }
    }

    @Override
    public void filterProduct(String filter) {
        int counter = 0;
        for (NoteBookStore noteBookStore : this.noteBookStoreslist) {
            if (noteBookStore.getProducerName().equalsIgnoreCase(filter)) {
                System.out.printf("%5s | %6s | %10s | %10s | %6s | %10s | %6s \n",
                        noteBookStore.getProductId(), noteBookStore.getProductName(),
                        noteBookStore.getProducerName(), noteBookStore.getProductStock(),
                        noteBookStore.getNumberOfSheets(), noteBookStore.getUnitPrice() + " Lira",
                        noteBookStore.getProductStock());
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("Eşleşen ürün bulunamadı");
        }
    }
}


