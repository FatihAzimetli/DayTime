package TicketReservation01;

public class Ticket {
    //mesafe(km) , Secilen koltugun numarasi, yolculuk tipi yön
    public double distance; // distance : mesafe

    public int typNo;    //yolculuk tipi gidis 1 gidis- dönüs 2

    public String seatNo;  // koltuk numarasi

    private double price; // tutar bedel 1-bilet fiyatini hesaplama ve 2-bileti yazdirma


    public void getTotalPrice(int age){// bilet fiyatini hesaplama
        double total = 0;
        int seat = Integer.parseInt(this.seatNo);

        switch (this.typNo){
            case 1 ://tekyön
                if (seat%3==0){
                    total=this.distance*1.2;
                }else {
                    total=this.distance*1;
                }
                System.out.println("toplam Tutar = " + total);
                break;
            case 2://Cift yön
                if (seat%3==0){
                    total=this.distance*2.4;
                }else {
                    total = this.distance * 2;
                }
                    System.out.println("toplam Tutar = " + total);
                    //cift yön indirimi
                    total=total*0.8;//%20 indirim
                    System.out.println("Cift yön indirimi = " + total);
                    break;
        }
        //Son tutardan yas indirim
        if (age<12){
            total=total*0.5;
            System.out.println("12 yas indirimi = " + total);
        } else if (age>65) {
            total = total*0.7;
            System.out.println("65 yas indirimi = " + total);
        }
            this.price = total;
    }
//Biletin yazdirilmasi
    public void printTicket(Bus bus){
        //Bus bus=new Bus("44Add44");
        System.out.println("".repeat(42));
        System.out.println("--Bilet detayi__");
        System.out.println("Otobus Plakasi    :"+bus.numberPlate);
        System.out.println("Mesafe bilisi     :"+this.distance);
        System.out.println("Yolculuk Tipi     :"+(this.typNo==1 ?"Tek yön":"Cift yön"));
        System.out.println("Koltuk No         :"+this.seatNo);
        System.out.println("Toplam tutar      :"+this.price);
        System.out.println("".repeat(42));
    }


}
