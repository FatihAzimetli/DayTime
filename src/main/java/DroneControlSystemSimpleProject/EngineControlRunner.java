package DroneControlSystemSimpleProject;

import java.util.Scanner;

public class EngineControlRunner {
    public static void main(String[] args) {
        start ();
    }
    private static void start (){
        Scanner input = new Scanner(System.in);
        int select ;
        do {
            System.out.println("Motor hiz kontrol yönetimindesiniz ");
            System.out.println("1-Hiz artirma");
            System.out.println("2-Hiz düsürme");
            System.out.println("0-Cikis ");

            select = input.nextInt();
            switch (select){
                case 1:
                    System.out.println();
                    break;
                case 2:
                    System.out.println();
                    break;
                case 0:
                    System.out.println("Cikis islemi gerceklesiyor");
                    break;
                default:
                    System.out.println("Hatali giris");
                    break;

            }

        }while (select !=0);



    }
}