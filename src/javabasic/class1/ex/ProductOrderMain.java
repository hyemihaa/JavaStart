package javabasic.class1.ex;

public class ProductOrderMain {

    public static void main(String[] args) {
        ProductOrder[] productOrders = new ProductOrder[3];

        ProductOrder order1 = new ProductOrder();
        order1.productName = "치킨";
        order1.price = 15000;
        order1.quantity = 2;
        productOrders[0] = order1;

        ProductOrder order2 = new ProductOrder();
        order2.productName = "피자";
        order2.price = 18000;
        order2.quantity = 1;
        productOrders[1] = order2;

        ProductOrder order3 = new ProductOrder();
        order3.productName = "족발";
        order3.price = 25000;
        order3.quantity = 1;
        productOrders[2] = order3;

        int totalAmount = 0;
        for (ProductOrder order : productOrders) {
            System.out.println("상품명: " + order.productName + " 가격: " + order.price + " 수량: " + order.quantity);
            totalAmount += (order.price * order.quantity);
        }
        System.out.println("총 결제 금액: " + totalAmount);
    }
}
