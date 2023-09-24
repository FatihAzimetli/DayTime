package RestaurantBillGenerator;

import java.util.List;
import java.util.Scanner;

public class OrderDeliveryService {

    public static void deliverOrder(List<Order> orderList) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sipariş kodunu giriniz: ");
        int orderCode = input.nextInt();

        boolean isFound = false;

        for (Order order : orderList) {
            if (order.getOrderCode() == orderCode) {
                System.out.println("Sipariş teslim ediliyor...");
                orderList.remove(order);
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            System.out.println("Sipariş bulunamadı!");
        }
    }
}