package scanner.ex;

import java.util.Scanner;

public class ScannerEx6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("당신의 이름을 입력하세요 : ");
        String name = scanner.nextLine();

        System.out.print("당신의 나이를 입력하세요 : ");
        int age = scanner.nextInt();

        System.out.println("당신의 이름은 " + name + "이고, 나이는 " + age + "살 입니다.");


        System.out.print("하나의 정수 입력 : ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("입력한 숫자 " + number + "는 짝수입니다.");
        } else {
            System.out.println("입력한 숫자 " + number + "는 홀수입니다.");
        }


        System.out.print("음식 이름 : ");
        String foodName = scanner.nextLine(); 
        
        System.out.print("음식 가격 : ");
        int foodPrice = scanner.nextInt();
        
        System.out.print("음식 수량 : ");
        int foodQuantity = scanner.nextInt();

        int totalPrice = foodPrice * foodQuantity;

        System.out.println(foodName + " " + foodQuantity + "개 주문 총 가격은 " + totalPrice + "원");
        
        
    }


}
