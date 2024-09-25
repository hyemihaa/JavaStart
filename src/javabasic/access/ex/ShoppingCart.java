package javabasic.access.ex;

public class ShoppingCart {
    private Item[] items = new Item[3];
    private int itemCount;

    // item 담기
    public void addItem(Item item) {
        // 검증 로직
        if (itemCount >= items.length) {
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }
        // 검증 통과 시 실행 로직
        items[itemCount] = item;
        itemCount++;
    }

    // 출력 로직
    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            System.out.println("상품명: " + item.getName() + ", 합계: " + item.getTotalPrice());
        }
        System.out.println("전체 가격 합: " + calculateTotalPrice());
    }

    // 전체 가격 합산
    private int calculateTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}
