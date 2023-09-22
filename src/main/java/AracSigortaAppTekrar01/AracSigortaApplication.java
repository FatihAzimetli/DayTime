package AracSigortaAppTekrar01;
/*
        * proje :
        * Araca Sigorta Prim Hesaplama
        * Arac tipleri : otomobil, kamyon, otobus, motosiklet
        *            - otobus : 18-30 koltuk veya 31 üstü koltu
        *
        *
        * 1 - Tekrar tekrar kullanilabilir bir secim menüsü (form) gösterelim
        *  2- Tarife dönemi bilgisi, arac tipi bilgilerini kullanicidan alalim.
        *  3 - Hatali giriste hesaplama basarisiz uyarisi verip tekrar menü (form) gösterilsin
        *  4- Menüde yeni islem veya cikis icin secenek sunulsun.
        *  5- Tarife döemi ve arac tipine göre sigorta primi hesaplansin*/

import java.util.Scanner;

public class AracSigortaApplication {
    public static void main(String[] args) {
        //1. Uygulamayi baslatan bir metod yazilacak.1 - Tekrar tekrar kullanilabilir bir secim menüsü (form) gösterelim
        // Metod yazma sebebi kodun tekrar tekrar kullanilabilir olmasi icindir

        start (); //stard metodu olusturmak istedik import edebilinirdi ancak biz kendi metodumuzu yapmak icin asagiya yeni metos yazdik



    }
    public static void start (){//objenen bagimsiz calisabilmesi icin "statik" olmak zorundadir.
        // Bu yapi kullanici bilgileri gerekiyor bu yüzden Scanner kullanacagiz
        //2- Tarife dönemi bilgisi, arac tipi bilgilerini kullanicidan alalim.


        Scanner input = new Scanner(System.in);
        boolean isAgain; // Again= Tekrar is Again= yine

        // kullaniciya secenek sunulacak basarisizda olsa döngü sürekli dönecek

        //2- Tarife dönemi bilgisi, arac tipi bilgilerini kullanicidan alalim.

        // döngüler icin whihl veya do while veya if- else if kullanilabilir
        // for döngüsü kullanilamaz cünkü for loop icin islemin kac kere yapilacak olmasini bilmemiz gerekiyor
        // bu bilinmedigi icin for loop kullanilmaz Kullanici devam etmek ister yada cikmak isteyebilir
        // bir islemden sonra kullanicinin iki secenegi var bu drumda ya while yada do while kullanabiliriz //
        // do while'en whileden farki nedir.?
        // Do while en az bir kere calisir bilgi dogru yada yanlis önemsizdir ve sonra kosulu kontrol eder.
        // while ise ksula bagli olarak en az 0 veya daha fazla kez calistirmak icin kullanilir.
        // while ilk gris true ise calismaya devam eder
        // Bu durumda Scannerin altina kosul koyariz   (boolean isAgain;) kosul olarak tekrar boolun dogru ise tekrar calis
        //deger yanlis ise döngoden cik diyecegiz
        // bu anlamda hicbir kosul olamadan sistem calismaya basliyacak

        do {
            System.out.println("--Zorunlu arac sigorta primi hesaplama---");// giris basligi önece bu gelecek
            System.out.println("Tarife dönemei seciniz  :"); //kulanicidan dönem sec istiyoruz
            System.out.println("1.nci dönem Haziran 2023 ");
            System.out.println("2.nci dönem Aralik 2023");// Kullanici bunu nasil sececek
            int period = input.nextInt(); // scanner input burda devreye giriyor //period : dönem demektir
            String periodName = period==1 ? "Haziran 2023" : "Aralik 2023"; //kullanici 1 veya 2 disinda baska bir sey yazarsa
            //bu durumda hata mesaji icin if kullanilir
            int select;
            if(period==1 || period==2){
                //4- Menüde yeni islem veya cikis icin secenek sunulsun.
                // bu durumda arac objesi olusturulur yani yeni klas yapilir
                Arac arac = new Arac();
                System.out.println("Arac tipini giriniz");
                System.out.println("otomobil , kamyon , otobüs, motosiklet");
               arac.type= input.next();
               arac.countPrim(period);
               if(arac.prim>0){
                   System.out.println("`---------------");
                   System.out.println("Arac tipi :"+arac.type);
                   System.out.println("Tarife dönemi"+ periodName);
                   System.out.println("Araciniz ilgili dönem sigorta primi");
                   System.out.println("Yeni islem icin 1, cikis icin 0 seciniz");
                   select = input.nextInt();
                   isAgain= select == 1? true: false;

               }else {
                   System.out.println("Hesaplama basariziz ,Tekrar deneyin");
                   System.out.println("Yeni islem icin 1, cikis icin 0 seciniz");
                   select = input.nextInt();
                   isAgain= select == 1? true: false;
               }

            }else {//Hatali giris icin mesaj verir
                System.out.println("Hatali giris"); //Bu durumda  isAgain gitmeli o true ise calismaya devam etsin
                isAgain=true;
            }





        }while (isAgain);

    }
















}
