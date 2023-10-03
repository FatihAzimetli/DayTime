package BookStore;
 //Kitap özellikleri: id, isim, birim fiyat, stok, yazar adı, yayınevi,isbn no
public class BookStore extends Product {
    private String writerName;
    private String publisherHous;
    private String isbnNo;


     public BookStore(String productName, double unitPrice, int productStock, String writerName, String publisherHous, String isbnNo) {
         super(productName, unitPrice, productStock);
         this.writerName = writerName;
         this.publisherHous = publisherHous;
         this.isbnNo = isbnNo;
     }

     public String getWriterName() {
         return writerName;
     }

     public void setWriterName(String writerName) {
         this.writerName = writerName;
     }

     public String getPublisherHous() {
         return publisherHous;
     }

     public void setPublisherHous(String publisherHous) {
         this.publisherHous = publisherHous;
     }

     public String getIsbnNo() {
         return isbnNo;
     }

     public void setIsbnNo(String isbnNo) {
         this.isbnNo = isbnNo;
     }
 }
