package BalikHavuzuKontrolProjesi;
/*Bir alabalık balık havuzu oluşturun
1. balıklara düzenli aralıklarla yem veren bir besleme sistemi oluşturun
2. Bu balık havuzunun sıcaklığını yerel hava koşullarına göre kontrol eden bir otomasyon sistemi olusturun. :*/

public class Balik {
    private String isim;
    private  boolean acik;

    public Balik(String isim){
        this.isim = isim;
        this.acik = true;
    }

    public void yemVer(){
        if (acik){
            System.out.println(isim+" adli baliga yem verildi");
        }else {
            System.out.println(isim+" adli balik ac degil , yem verilmedi . ");
        }
    }

     public void kapat(){
        acik = false;
    System.out.println(isim + " adli balik havuzunun isigi kapatildi");
     }

     public void ac(){
        acik = true;
         System.out.println(isim + " adli balik havuzunub isigini acti");
     }


}
