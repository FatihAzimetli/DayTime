package TicketReservation;

import java.util.Scanner;

/*Project
        * Bilet rezervasyonu ve bilet Fiyati Hesaplama uygulamasi
        *      1- Uygulama mesafe ve Kurallara göre otobüs bileti fiyati hesaplar sonuc olarak bilet bilgisini verir
        *       2- Kullanicidan      Mesafe (KM)
        *                            yolcu yasi.
        *                            yolculuk tipi (Tek yön, Gidis-Dönüs)
        *                            koltuk ve no bilgieri alinir
        *              NOT : Koltuk numarasi 1-32 araliginda olmalidir
        *                   Kullanicidan alinan degerler gecerli ( Mesafe ve yas degerleri pozitif sayi, Yolculuk tipip ise 1
        *                   veya 2 olmalidir.
        *                   Aksi halde kullaniciya "Hatali Veri Girdiniz !" seklinde bir uyari verilmelidir
        *     3- Fiyat hesaplama kurallari :
        *       -Mesafe basina ücret
        *            tek yön 1 lira / Km      Cift yön (Gidis-Dönüs) : 2 lira/km
        *        -Tekli koltuk ücreti :
        *                Koltuk no 3 veya 3 ün kati ise fiyat %20 daha fazladir ( tek yön: 1.2 lira/km , cift Yön 2.4 lira/km)
        *         - ilk olarak seferin mesafe , yön ve koltuk bilgisine göre fiyati hesaplanir.
        *            sonrasinda kosullara göre asagidaki indirimler uygulanir;
        *              1- cift yöm indirim:
        *           "Yolculuk tipi" gidis dönüs secilmis ise son bilet fiyati üzerinden %20 indirim uygulanir
        *              2- yas indirimi :
        *            Kisi 12 yasindan kücükse son bilet fiyati üzerinden %50 indirim uygulanir
        *            Kisi 65 yasindan büyük ise son bilet fiyati üzerinden %30 indirim uygulanir.*/
public class TicketReservationApp {
    public static void main(String[] args) {

//1-Bilet rezervasyonunu yapacagiz
        Bus bus = new Bus("34ASD789");

        //2.Bilet objesi
Ticket bilet = new Ticket();
start(bus,bilet);






    }

    private static void start(Bus bus, Ticket bilet) {
        Scanner input = new Scanner(System.in) ;
        //Kullanici bilgisi alinacak while veya do while metodu ile yapilabilir
        int seleckt; // kullaniciya cikis icin 0 secenegi verilebbilir
        do {
            System.out.println("Bilet rezervasyonuna hos geldiniz");

            System.out.println("Lütfen yasinizi giriniz");
            int age= input.nextInt();

            System.out.println("Lütfen Mesafe bilsini km olarak giriniz");
            int distance = input.nextInt();

            //System.out.println("Lütfen yolculuk yönünü seciniz");
            //int distance= input.nextInt();

            System.out.println("Lütfen Yolculuk tipini seciniz");
            System.out.println("1. Tek yön");
            System.out.println("2. Cift yön");
            int type = input.nextInt();

            System.out.println("Koltuk numarasi seciniz");
            System.out.println("Tekli koltuk ücreti %20 Pahalidir");
            System.out.println(bus.seat);//mevcut koltuk numaralarini gösteriyor String olarak tanimlandi
            String seat= input.next();

            //secilen koltuk listede varmi? Rezerve edeilmismi?
           boolean isReserved = ! bus.seat.contains(seat);
           if ( isReserved){//Koltuk listede yoksa
               System.out.println("Secilen koltuk rezerve edilmistir");
           }
           //girilen degerler gecerli mi
            if (age>0 && distance>0 && (type==1 || type==2) && ! isReserved){
                //koltuk numarasi rezerve edilince listeden cikarilmalidir
                bus.seat.remove(seat);
             //biletin olusturulmasi
                bilet.distance =distance;
                bilet.typNo = type;
                bilet.seatNo = seat;
                bilet.getTotalPrice(age);
                //Bileti yazdirma
                bilet.printTicket(bus);

            }else{
                System.out.println("Gecersiz giris yaptiniz");
            }
            System.out.println("Yeni islem icin herhangi bir sayi cikis icin 0 giriniz");
             seleckt = input.nextInt();

        }while (seleckt !=0);
        System.out.println("Iyiy günler dileriz");




    }





}
