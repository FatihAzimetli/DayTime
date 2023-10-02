package BusCompany;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;

public class Bus {
    private String plateNumber;
    private int capacity;
    private double maintanenceCost;
    private double dailyFuelCost;
    private double cleaningCost;
    private List<Passenger> passengers;
    private List<Driver> drivers;

    public Bus(String plateNumber, int capacity,
               double maintanenceCost, double dailyFuelCost, double cleaningCost  ){
        this.plateNumber = plateNumber;
        this.capacity = capacity;
        this.maintanenceCost= maintanenceCost;
        this.dailyFuelCost =dailyFuelCost;
        this.cleaningCost =cleaningCost;
        this.passengers = new ArrayList<>();
        this.drivers = new ArrayList<>();

    }
    //yolcu tasima islemi
    public void trasportPassenger(Passenger passenger){
        passengers.add(passenger);
    }
    //2 söför ata
    public void driveBus(Driver driver){
        drivers.add(driver);
    }
    //Priyodik bakim yap
    public void periodMaintanence(){

    }
    //yakital
    public void refuel(){

    }
    public void clear(){

    }

    public void transportPassenger(Passenger passenger) {
    }
}

