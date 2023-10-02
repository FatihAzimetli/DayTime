package BusCompany;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private List<Office> offices;
    private List<Bus> buses;
    private List<Personnel> personel;

    public Company(String name){
        this.name =name;
        this.offices =new ArrayList<>();
        this.buses = new ArrayList<>();
        this.personel = new ArrayList<Personnel>();
    }
    public void addOffice( Office office){
        offices.add(office);
    }
    public void addBus(Bus bus){
        buses.add(bus);
    }
    public void addPersonel(Personnel person){
        personel.add(person);
    }
    public void calculateReveneu(){
        //Gelir hesapla
    }
    public void calculateExpenses(){}

    private class Personel {
    }
}


