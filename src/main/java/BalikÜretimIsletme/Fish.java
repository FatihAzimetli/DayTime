package BalikÜretimIsletme;

public class Fish {
    private String species; //baligin türü
    private double lenght;
    private double weite;
    private int age;

    public Fish(String species, double lenght, double weite, int age){
        this.species = species;
        this.lenght =lenght;
        this.weite =weite;
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getWeite() {
        return weite;
    }

    public void setWeite(double weite) {
        this.weite = weite;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
