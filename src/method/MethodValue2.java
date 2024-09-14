package method;

public class MethodValue2 {

//    public static void main(String[] args) {
//        int number = 5; // main 메서드의 number 변수
//        System.out.println("1. changeNumber 호출 전, num1 : " + number); // 5
//        changeNumber(number); // 5
//        System.out.println("4. changeNumber 호출 후, num1 : " + number); // 5
//
//    }
//// 서로 다른 변수 number
//    public static void changeNumber(int number) { // changeNumber 메서드의 number 매개변수
//        System.out.println("2. changeNumber 변경 전, num2 : " + number); // 5
//        number = number * 2; // 10
//        System.out.println("3. changeNumber 변경 후, num2 : " + number); // 10
//    }


    public static void main(String[] args) {
        int num1 = 5; // main 메서드의 number 변수
        System.out.println("1. changeNumber 호출 전, num1 : " + num1); // 5
        num1 = changeNumber(num1); // 5
        System.out.println("4. changeNumber 호출 후, num1 : " + num1); // 10
    }

    public static int changeNumber(int num2) { // num2를 반환 시킴
        System.out.println("2. changeNumber 변경 전, num2 : " + num2); // 5
        num2 = num2 * 2; // 10
        System.out.println("3. changeNumber 변경 후, num2 : " + num2); // 10

        return num2;
    }



}
