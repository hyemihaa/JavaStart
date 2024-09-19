package javabasic.ref.ex;


public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder[] productOrders = new ProductOrder[3];

        productOrders[0] = createOrder("치킨", 15000, 2);
        productOrders[1] = createOrder("피자", 18000, 1);
        productOrders[2] = createOrder("족발", 25000, 1);

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
