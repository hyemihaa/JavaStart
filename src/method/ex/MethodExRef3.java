package method.ex;

public class MethodExRef3 {

    // 메서드를 재사용을 하는게 목적이 아닌,
    // 구조적으로 읽기 쉽고 유지보수 하기 좋은 코드 만들기 위한 메서드 분류
    public static void main(String[] args) {
        int balance = 10000;

        // 입금 1000원
        balance = deposit(balance, 1000);
        // 출금 2000원
        balance = withdraw(balance, 2000);
        System.out.println("최종 잔액 : " + balance + "원");

    }

    // 입금시 결과값(잔액) 반환
    public static int deposit(int balance, int amount) {
        balance += amount;
        System.out.println(amount + "원을 입금, 현재 잔액 : " + balance);

        return balance;
    }

    // 출금시 결과값(잔액) 반환
    public static int withdraw(int balance, int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원을 출금, 현재 잔액 : " + balance);
        } else {
            System.out.println(amount + "원을 출금 실패, 잔액 부족");
        }
        return balance;
    }
}
