package javastart.method.ex;

public class MethodExRef2 {

    public static void main(String[] args) {
        printMessage("Hello, world", 3);
        System.out.println("=====================");
        printMessage("Hello, world", 5);
        System.out.println("=====================");
        printMessage("Hello, world", 7);
    }

    public static void printMessage(String message, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(message);
        }
    }
}
