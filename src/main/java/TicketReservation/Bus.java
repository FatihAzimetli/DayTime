package TicketReservation;

import java.util.ArrayList;
import java.util.List;

public class Bus {
    
    public String numberPlate;
    
    public List<String> seat = new ArrayList<>();// koltoklari string olarak atama yapti
    
    public Bus(String plaka){
        this.numberPlate=plaka;//otobusun plakasi set edildi
        for (int i = 1; i < 33; i++) {// otobusun koltuklari set edildi
            //this.seat.add(String.valueOf(i));
            this.seat.add(i+"");
        }
    }



}
