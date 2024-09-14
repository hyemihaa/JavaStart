package method;

public class Method2 {

    public static void main(String[] args) {
        printHeader();
        System.out.println("프로그램 동작");
        printFooter();
    }

    public static void printHeader() { // 메서드 선언
        System.out.println("프로그램 시작 =");
        return; // 반환 타입이 void -> 생략 가능
    }

    public static void printFooter() {
        System.out.println("= 프로그램 종료");
    }


}
