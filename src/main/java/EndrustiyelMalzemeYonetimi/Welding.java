package EndrustiyelMalzemeYonetimi;

public class Welding extends Product{
    private String measuringUnit;
    private String userSection;
    private String isbnNo;

    public Welding(String materialName, int amountOfStock, String productName, String productCode, String measuringUnit, String userSection, String isbnNo) {
        super(materialName, amountOfStock, productName, productCode);
        this.measuringUnit = measuringUnit;
        this.userSection = userSection;
        this.isbnNo = isbnNo;
    }

    public String getMeasuringUnit() {
        return measuringUnit;
    }

    public void setMeasuringUnit(String measuringUnit) {
        this.measuringUnit = measuringUnit;
    }

    public String getUserSection() {
        return userSection;
    }

    public void setUserSection(String userSection) {
        this.userSection = userSection;
    }

    public String getIsbnNo() {
        return isbnNo;
    }

    public void setIsbnNo(String isbnNo) {
        this.isbnNo = isbnNo;
    }
}
