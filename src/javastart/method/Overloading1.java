package javastart.method;

public class Overloading1 {

    public static void main(String[] args) {
        System.out.println("1 : " + add(3, 4));
        System.out.println("2 : " + add(3, 4, 3));

    }

    // 매개변수(파라미터 개수가 다른 매서드)
    public static int add(int a, int b) {
        System.out.println("1번 호출");
        return a + b;
    }
    public static int add(int a, int b, int c) {
        System.out.println("2번 호출");
        return a + b + c;
    }
}
