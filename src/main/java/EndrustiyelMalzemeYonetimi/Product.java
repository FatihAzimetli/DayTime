package EndrustiyelMalzemeYonetimi;
//Bu ürünleri özellikleri
// 1-Malzeme ID     2-Malzeme Ismi      3- malzeme ölcü birimi (hepsinde Farkli)       4- stok miktari-
// 1- Id             2-Material Name    3- Material Measuring Unit                    4- Amount Of Stock-
// 5- Üretici adi-      6- Kullanici bölüm (farkli)       7- Ürün kodu                8- ürün ISBN no
// 5- Product Name      6-User section                    7- Product code              8- Product ISBN Mumber
public class Product {
    private static int counter=1;

    private int id; //oto generate

    private String materialName;

    private int amountOfStock;
    private String productName;


    private String productCode;



    public Product(String materialName, int amountOfStock, String productName,  String productCode) {
        this.id = counter++;
        this.materialName = materialName;
        this.amountOfStock = amountOfStock;
        this.productName = productName;
        this.productCode = productCode;

    }

    public int getId() {
        return id;
    }



    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public int getAmountOfStock() {
        return amountOfStock;
    }

    public void setAmountOfStock(int amountOfStock) {
        this.amountOfStock = amountOfStock;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }



    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }


}


