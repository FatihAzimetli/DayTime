package EndrustiyelMalzemeYonetimi;
//Bu ürünleri özellikleri 1-Malzeme ID   2-Malzeme Ismi  3- malzeme ölcü birimi (hepsinde Farkli)   4- stok miktari-
//                        1- Id          2-Material Name 3- Material Measuring Unit                4- Amount Of Stock-
//                        5- Üretici adi-      6- Kullanici bölüm (farkli)   7- Ürün kodu      8- ürün ISBN no
//                        5- Product Name       6-User section        7- Product code   8- Product ISBN Mumber(Farkli)
public class ElectroMekanik extends Product{

private String measuringUnit;
private String userSection;
private String isbnNo;

    public ElectroMekanik(String materialName, int amountOfStock, String productName,
                          String productCode,String measuringUnit,String userSection, String isbnNo) {
        super(materialName, amountOfStock, productName, productCode);
        this.measuringUnit =measuringUnit;
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


