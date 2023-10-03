package MarketOperatingSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Market {
    private String name;
    private List<Employee> employees; // Çalışanlar
    private List<Product> products; // Ürünler
    private List<Expense> expenses; // Giderler
    private Map<Product, Integer> soldQuantities;

    public Market(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
        this.products = new ArrayList<>();
        this.expenses = new ArrayList<>();
        this.soldQuantities = new HashMap<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void addExpense(Expense expense) {
        expenses.add(expense);
    }

    // Ürün satış işlemleri
    public void sellProduct(Product product, int quantity) {
        // Burada ürün satışı ve kar hesaplama işlemleri yapılacak
        double totalSale = product.getSellingPrice() * quantity;
        System.out.println(quantity + " Adet " + product.getName() + " satıldı. Toplam gelir " + totalSale);
        // Satılan ürün miktarını güncelle
        int currentQuantity = soldQuantities.getOrDefault(product, 0);
        soldQuantities.put(product, currentQuantity + quantity);
    }

    // Kar hesaplama işlemleri
    public void calculateProfit() {
        // Burada toplam gelir, toplam gider ve kar hesaplama işlemleri yapılacak
        double totalIncome = 0;
        double totalExpense = 0;

        // Satılan ürünlerin gelirini topla
        for (Product product : products) {
            totalIncome += product.getSellingPrice() * soldQuantities.getOrDefault(product, 0);
        }

        // Giderleri topla
        for (Expense expense : expenses) {
            totalExpense += expense.getAmount();
        }

        // Karı hesapla
        double profit = totalIncome - totalExpense;

        // Sonuçları konsola yazdır
        System.out.println("Toplam gelir: " + totalIncome);
        System.out.println("Toplam gider: " + totalExpense);
        System.out.println("Kar: " + profit);
    }

    // Diğer getter ve setter metotları

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Expense> getExpenses() {
        return expenses;
    }

    public void setExpenses(List<Expense> expenses) {
        this.expenses = expenses;
    }

    public Map<Product, Integer> getSoldQuantities() {
        return soldQuantities;
    }

    public void setSoldQuantities(Map<Product, Integer> soldQuantities) {
        this.soldQuantities = soldQuantities;
    }

}



