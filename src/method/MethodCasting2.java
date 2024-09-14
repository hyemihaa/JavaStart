package method;

public class MethodCasting2 {

    public static void main(String[] args) {
        int number = 100;
        printNumber(number);
    }

    public static void printNumber(double n) { // double형 매개변수(파라미터)에 int형 인수 전달 문제 없이 동작(자동 형변환)
        System.out.println("숫자 : " + n);
    }
}
