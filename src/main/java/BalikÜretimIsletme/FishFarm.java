package BalikÜretimIsletme;

import java.util.ArrayList;
import java.util.List;

public class FishFarm {
    private FishPool fishPool; //Balik havuzu
    private List<Personnel> personnel; //Personel listesi
    private double transportationCost; //Nakliye giderleri
    private double eleckricityCost; //elekrtrik giderleri
    private double waterCost; // su giderleri
    private double feedCost; //yem giderleri

    public void FishFarm(double transportationCost, double eleckricityCost, double waterCost, double feedCost, FishPool fishPool){
        this.transportationCost = transportationCost;
        this.eleckricityCost = eleckricityCost;
        this.waterCost =waterCost;
        this.feedCost = feedCost;
        this.fishPool = fishPool;
        this.personnel = new ArrayList<>();
    }

    public FishPool getFishPool() {
        return fishPool;
    }

    public void setFishPool(FishPool fishPool) {
        this.fishPool = fishPool;
    }

    public List<Personnel> getPersonnel() {
        return personnel;
    }

    public void setPersonnel(List<Personnel> personnel) {
        this.personnel = personnel;
    }

    public double getTransportationCost() {
        return transportationCost;
    }

    public void setTransportationCost(double transportationCost) {
        this.transportationCost = transportationCost;
    }

    public double getEleckricityCost() {
        return eleckricityCost;
    }

    public void setEleckricityCost(double eleckricityCost) {
        this.eleckricityCost = eleckricityCost;
    }

    public double getWaterCost() {
        return waterCost;
    }

    public void setWaterCost(double waterCost) {
        this.waterCost = waterCost;
    }

    public double getFeedCost() {
        return feedCost;
    }

    public void setFeedCost(double feedCost) {
        this.feedCost = feedCost;
    }
}
