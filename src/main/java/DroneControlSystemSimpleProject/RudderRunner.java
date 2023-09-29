package DroneControlSystemSimpleProject;


import java.util.Scanner;
public class RudderRunner {
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        Scanner input = new Scanner(System.in);
        int select;

        do {
            System.out.println("Dümen Kontrolü ");
            System.out.println("1-Sağa yönelme");
            System.out.println("2-Sola yönelme");
            System.out.println("0-Çıkış");

            select = input.nextInt();
            switch (select) {
                case 1:
                    System.out.println("Sağa yöneliliyor");
                    break;
                case 2:
                    System.out.println("Sola yöneliliyor");
                    break;
                case 0:
                    System.out.println("Çıkış işlemi gerçekleşiyor");
                    break;
                default:
                    System.out.println("Hatalı giriş");
                    break;
            }

        } while (select != 0);
    }
}

