package javastart.method.ex;

import java.util.Scanner;

public class MethodEx4 {

    public static void main(String[] args) {
        int balance = 0; // 현재 잔액
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("----------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            System.out.println("----------------------------------");
            System.out.print("선택 : ");

            int choice = scanner.nextInt();
            int amount;

            switch (choice) {
                case 1:
                    System.out.print("입금액 입력 : ");
                    amount = scanner.nextInt();
                    balance = deposit(balance, amount);
                    break;
                case 2:
                    System.out.print("출금액 입력 : ");
                    amount = scanner.nextInt();
                    balance = withdraw(balance, amount);
                    break;
                case 3:
                    System.out.println("현재 잔액은 = " + balance + "원");
                    break;
                case 4:
                    System.out.println("시스템 종료");
                    return; // 메서드 종료, break 사용시 다시 while문을 돌기 때문에 사용X
                default:

            }
        }
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
