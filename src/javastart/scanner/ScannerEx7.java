package javastart.scanner;

import java.util.Scanner;

public class ScannerEx7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("구구단 단 수 입력 : ");
        int num = scanner.nextInt();

        System.out.println((num + "단"));
        for (int i = 1; i <= 9; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }
}
