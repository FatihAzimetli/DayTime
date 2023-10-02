package BalikÜretimIsletme;

import java.util.ArrayList;
import java.util.List;

public class FishPool {
    private double temperatureControl;
    private double oxygenControl;
    private boolean otoFeedingSystem;
    private int capacity;
    private List<Fish>fishes;

    public FishPool(double temperatureControl, double oxygenControl, boolean otoFeedingSystem, int capacity){
        this.temperatureControl = temperatureControl;
        this.oxygenControl= oxygenControl;
        this.otoFeedingSystem = otoFeedingSystem;
        this.capacity=capacity;
        this.fishes = new ArrayList<>();
    }
    //havuza balik eklemek
    private void addFish(Fish fish){
        if (fishes.size() < capacity){
            fishes.add(fish);
            System.out.println("Balik eklendi :" + fish.getSpecies());
        }else{
            System.out.println("Balik kapasitesi dolu, Balik eklenemedi");
        }
    }

    public double getTemperatureControl() {
        return temperatureControl;
    }

    public void setTemperatureControl(double temperatureControl) {
        this.temperatureControl = temperatureControl;
    }

    public double getOxygenControl() {
        return oxygenControl;
    }

    public void setOxygenControl(double oxygenControl) {
        this.oxygenControl = oxygenControl;
    }

    public boolean isOtoFeedingSystem() {
        return otoFeedingSystem;
    }

    public void setOtoFeedingSystem(boolean otoFeedingSystem) {
        this.otoFeedingSystem = otoFeedingSystem;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Fish> getFishes() {
        return fishes;
    }

    public void setFishes(List<Fish> fishes) {
        this.fishes = fishes;
    }
}
