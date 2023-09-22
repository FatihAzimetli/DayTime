package day19oopTekrar;

public class Civic implements Ac, Engine, Security {
    @Override
    public void cool() {
        System.out.println("Civic cools perfect");
    }

    @Override
    public void run() {
        System.out.println("Ac runs super");
    }
}
