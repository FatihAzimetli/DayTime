package day19oopTekrar;

public interface Ac {

   public static final  int price = 2000;

   public abstract void cool ();

   void run();

  public default void eco(){
      System.out.println("uses gas less..");
   }


}