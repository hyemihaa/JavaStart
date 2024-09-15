package javastart.scanner;

import java.util.Scanner;

public class ScannerEx5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.print("정수 입력 (0 입력시 종료) : ");
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            sum += number;
        }
        System.out.println("입력한 모든 정수 의 합 : " + sum);
    }
}
