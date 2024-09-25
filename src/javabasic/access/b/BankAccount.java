package javabasic.access.b;

public class BankAccount {
    private int balance;

    // 금액 검증
    private boolean isAmountValid(int amount) {
        // 금액이 0보다 커야 함
        return amount > 0; // true 반환
    }

    // 입금
    public void deposit(int amount) {
        if (isAmountValid(amount)) {
            balance += amount;
        } else {
            System.out.println("유효하지 않은 금액");
        } 
    }

    // 출금
    public void withdraw(int amount) {
        if (isAmountValid(amount) && (balance - amount) >= 0) {
            balance -= amount;
        } else {
            System.out.println("유효하지 않은 금액이거나, 잔액 부족");
        } 
    }

    // 잔액
    public int getBalance() {
        return balance;
    }
}
