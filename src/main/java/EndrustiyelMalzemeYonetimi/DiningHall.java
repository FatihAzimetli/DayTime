package EndrustiyelMalzemeYonetimi;

public class DiningHall extends Product{

    private String measuringUnit;
    private String userSection;
    private String isbnNo;
    public DiningHall(String materialName, int amountOfStock, String productName, String productCode) {
        super(materialName, amountOfStock, productName, productCode);
    }
}
