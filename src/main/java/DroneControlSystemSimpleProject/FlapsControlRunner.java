package DroneControlSystemSimpleProject;

import java.util.Scanner;

public class FlapsControlRunner {
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        Scanner input = new Scanner(System.in);
        int select;

        do {
            System.out.println("Flap yönetimi");
            System.out.println("1-Yükselme");
            System.out.println("2-Alçalma");
            System.out.println("0-Çıkış");

            select = input.nextInt();
            switch (select) {
                case 1:
                    System.out.println("Flap yükseltiliyor");
                    break;
                case 2:
                    System.out.println("Flap alçaltılıyor");
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



