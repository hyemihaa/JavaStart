package javastart.method.ex;

public class MethodEx3 {

    public static void main(String[] args) {
        int balance = 10000;

        // 입금 1000원
        int depositAmount = 1000;
        balance += depositAmount;
        System.out.println(depositAmount + "원을 입금, 현재 잔액 : " + balance + "원");

        // 출금 2000원
        int withdrawAmount = 2000;
        if (balance >= withdrawAmount) {
            balance -= withdrawAmount;
            System.out.println(withdrawAmount + "원을 출금, 현재 잔액 : " + balance + "원");
        } else {
            System.out.println(withdrawAmount + "원을 출금 실패, 잔액 부족");
        }
        System.out.println("최종 잔액 : " + balance + "원");

    }
}
