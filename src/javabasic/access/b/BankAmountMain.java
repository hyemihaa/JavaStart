package javabasic.access.b;

public class BankAmountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.deposit(20000);
        account.withdraw(10000);

        int balance = account.getBalance();

        System.out.println("현재 잔액 : " + balance);

    }
}
