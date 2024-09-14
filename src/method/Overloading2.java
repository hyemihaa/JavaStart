package method;

public class Overloading2 {

    public static void main(String[] args) {
        method(10, 10.5);
        method(10.5, 10);

        System.out.println(method(10, 5));
        System.out.println(method(10.5, 2.7));

    }

    // 메서드 매개변수의 순서가 다른 경우
    public static void method(int a, double b) {
        System.out.println("1번 : int a, double b");
    }

    public static void method(double a, int b) {
        System.out.println("2번 : double a, int b");

    }

    // 메서드 매개변수의 type이 다른 경우
    public static int method(int a, int b) {
        System.out.println("3번 호출");
        return a + b;
    }

    public static double method(double a, double b) {
        System.out.println("4번 호출");
        return a + b;
    }

    /*
    * 메서드 호출시 최대한 타입이 맞는 메서드를 찾아 호출을 한다.*/
}
