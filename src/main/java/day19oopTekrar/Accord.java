package day19oopTekrar;

public class Accord implements Ac ,Engine, Security {
    @Override
    public void cool() {
        System.out.println("Accord cools super");
    }

    @Override
    public void run() {
        System.out.println("Accord cool super");
    }
}
