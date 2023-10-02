package MarketOperatingSystem;

public class Product {
    private String name;
    private double costPrice; //ürün maliyeti
    private double sellingPrice;//ürün satis fiyati

    public Product(String name, double costPrice){
        this.name = name;
        this.costPrice = costPrice;
        this.sellingPrice = calculateSellingPrice();
    }

    //satis fiyati belirleme islemleri
    private double calculateSellingPrice(){
        return costPrice * 1.4; // %40 maliyet ve kar
    }

    // diğer getter ve setter metotları

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(double costPrice) {
        this.costPrice = costPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }
}


