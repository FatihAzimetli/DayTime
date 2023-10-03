package BookStore;
//Defter özellikleri: id, isim, birim fiyat, stok, marka, yaprak sayısı,ürün kodu
public class NoteBookStore extends Product {
    private String producerName;
    private int numberOfSheets;
    private String productCode;


    public NoteBookStore(String productName, double unitPrice, int productStock, String producerName, int numberOfSheets, String productCode) {
        super(productName, unitPrice, productStock);
        this.producerName = producerName;
        this.numberOfSheets = numberOfSheets;
        this.productCode = productCode;
    }

    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    public int getNumberOfSheets() {
        return numberOfSheets;
    }

    public void setNumberOfSheets(int numberOfSheets) {
        this.numberOfSheets = numberOfSheets;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }
}
