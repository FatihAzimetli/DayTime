package EncapsulationValidasyonRead_OnlyWrite_once;

public class Main {
    public static void main(String[] args) {
        // Ana sınıftan bir örnek oluştur
        AnaSinif anaSinif = new AnaSinif ();
        // Ana sınıfın özelliklerini ayarla (set)

        anaSinif.setAd("Java");
        anaSinif.setYas(25);

        //anasinifin özelliklerini ekrana yazdirma
        System.out.println("Ad :" +anaSinif.getAd());
        System.out.println("Yas :" +anaSinif.getYas());

        //ikinci sinifa örnek olusturma
        IkinciSinif ikinciSinif = new IkinciSinif();
        //Ikinci snifin set özellikleri
        ikinciSinif.setOkuma("Cok iyi");
        ikinciSinif.setYazma("iyi");
        ikinciSinif.setOdeme(1000);

        //Ikinci sinifin özelliklerini ekrana yazdirma
        System.out.println("Ödeme  :" +ikinciSinif.getOdeme());
        System.out.println("Okuma :" +ikinciSinif.getOkuma());
        System.out.println("Yazma  :" +ikinciSinif.getYazma());


    }


}
