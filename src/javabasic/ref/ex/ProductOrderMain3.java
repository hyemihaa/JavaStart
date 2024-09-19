package javabasic.ref.ex;


import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("입력할 주문 개수 : ");
        int n = input.nextInt();
        input.nextLine();

        ProductOrder[] productOrders = new ProductOrder[n];

        for (int i = 0; i < productOrders.length; i++) {
            System.out.println((i + 1) + "번째 주문 정보 입력");

            System.out.print("상품명 : ");
            String productName = input.nextLine();

            System.out.print("가격 : ");
            int price = input.nextInt();

            System.out.print("수량 : ");
            int quantity = input.nextInt();

            input.nextLine(); // 입력 버퍼를 비우기 위한 코드

            productOrders[i] = createOrder(productName, price, quantity);
        }

        printOrders(productOrders);

        int totalAmount = getTotalAmount(productOrders);
        System.out.println("총 결제 금액: " + totalAmount);
    }

    static ProductOrder createOrder(String name, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = name;
        productOrder.price = price;
        productOrder.quantity = quantity;

        return productOrder;
    }

    static void printOrders(ProductOrder[] productOrders) {
        for (ProductOrder order : productOrders) {
            System.out.println("상품명: " + order.productName + " 가격: " + order.price + " 수량: " + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] productOrders) {
        int totalAmount = 0;
        for (ProductOrder order : productOrders) {
            totalAmount += order.price * order.quantity;
        }
        return totalAmount;
    }
}
