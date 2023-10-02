package BalikciTeknesi;

import java.util.ArrayList;
import java.util.List;

public class Paket {
   private List<Balik> baliklar;
   private String paketNo;
   public Paket(String paketNo){
       this.paketNo = paketNo;
       this.baliklar = new ArrayList<>();
   }

    public List<Balik> getBaliklar() {
        return baliklar;
    }

    public void setBaliklar(List<Balik> baliklar) {
        this.baliklar = baliklar;
    }

    public String getPaketNo() {
        return paketNo;
    }

    public void setPaketNo(String paketNo) {
        this.paketNo = paketNo;
    }
}
