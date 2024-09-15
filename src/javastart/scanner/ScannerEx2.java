package javastart.scanner;

import java.util.Scanner;

public class ScannerEx2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자 : ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 숫자 : ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("큰 숫자 : " + num1);
        } else if (num1 < num2) {
            System.out.println("큰 숫자 : " + num2);
        } else {
            System.out.println("두 숫자는 같습니다.");
        }

    }
}
