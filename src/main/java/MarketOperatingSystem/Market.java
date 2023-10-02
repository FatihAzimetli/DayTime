package MarketOperatingSystem;

import java.util.ArrayList;
import java.util.List;

public class Market {
    private String name;
    private List<Employee> employees; // calisanlar
    private List<Product> products; // ürünler
    private List<Expense> expenses; // giderler

    public Market(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
        this.products = new ArrayList<>();
        this.expenses = new ArrayList<>();
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

    // ürün satış işlemleri
    public void sellProduct(Product product, int quantity) {
        // Burada ürün satışı ve kar hesaplama işlemleri yapılacak
    }

    // kar hesaplama işlemleri
    public void calculateProfit() {
        // Burada toplam gelir, toplam gider ve kar hesaplama işlemleri yapılacak
    }

    // diğer getter ve setter metotları

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
}


