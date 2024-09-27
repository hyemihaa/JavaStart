package javabasic.static2;

public class DecoData {
    // 인스턴스 변수
    private int instanceValue;
    // 정적 변수(= 클래스 변수)
    private static int staticValue;

    public static void staticCall() {
//        instanceValue; // 인스턴스 변수 접근, compile error
//        instanceMethod(); // 인스턴스 메서드 접근, compile error

        staticValue++; // 정적 변수 접근 DecoData.staticValue++ : 자신의 클래스에서는 클래스 명 생략 가능
        staticMethod(); // 정적 메서드 접근 DecoData.staticMethod() : 자신의 클래스에서는 클래스 명 생략 가능
    }


    public void instanceCall() {
        instanceValue++; // 인스턴스 변수 접근
        instanceMethod(); // 인스턴스 메서드 접근

        staticValue++; // 정적 변수 접근
        staticMethod(); // 정적 메서드 접근
    }

    // 인스턴스 메서드
    private void instanceMethod() {
        System.out.println("instanceValue = " + instanceValue);
    }

    // 정적 메서드(= 클래스 메서드)
    private static void staticMethod() {
        System.out.println("staticValue = " + staticValue);
    }
}
