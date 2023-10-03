package MarketOperatingSystem;

public class MarketApp {
    public static void main(String[] args) {
        //market olusturma
        Market myMarket = new Market("My Market");

        //Örnek ürün ekleme
        Product apple = new Product("Apple :",3);
        Product milk = new Product("Milk :", 5);

        myMarket.addProduct(apple);
        myMarket.addProduct(milk);

        //personel eklemek
        Employee salesPerson = new Employee("Alice .",2000 );
        Employee cleaner = new Employee("Bob :", 1500);
        Employee maintenancePerson = new Employee("Charli :" ,1800);
        myMarket.addEmployee(salesPerson);
        myMarket.addEmployee(cleaner);
        myMarket.addEmployee(maintenancePerson);

        // Satış işlemi
        myMarket.sellProduct(apple, 150);
        myMarket.sellProduct(milk,150);

        // Temizlik işlemi
        myMarket.calculateProfit(); // Karı hesapla (bu işlem temizlik giderini içerir)

        // Bakım işlemi
        myMarket.addExpense(new Expense("Maintenance", 500));
        myMarket.calculateProfit(); // Yeni karı hesapla (bu işlem bakım giderini içerir)

    }

}



