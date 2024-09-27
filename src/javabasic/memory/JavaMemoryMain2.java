package javabasic.memory;

public class JavaMemoryMain2 {
     // 1.main() 실행 - main() 스택 프레임 생성, args 지역변수(매개변수) 스택에 저장
    public static void main(String[] args) {
        System.out.println("main start");
        // 2-1. method1() 실행
        method1();
        System.out.println("main end");
    }

    // 2-2. method1() 실행시 -> method1() 스택 프레임 생성
    static void method1() {
        System.out.println("method1 start");
        // 지역변수 data1 (Data 인스턴스의 참조값) : 스택 영역,
        // new Data(10) - Data 인스턴스(객체) 생성(실제 값) : 힙 영역
        Data data1 = new Data(10);
        // 3-1. method2() 실행 -> data1의 참조값이 data2의 매개변수로 넘어감
        // data1과 data2는 동일한 힙 영역의 Data 인스턴스(객체)를 가리킴
        method2(data1);
        System.out.println("method1 end");
    }

    // 3-2. method2 실행 -> method2() 스택 프레임 생성
    // 지역 변수(매개변수) data2 스택에 저장, data1과 같은 Data 인스턴스(객체)를 참조
    static void method2(Data data2) {
        System.out.println("method2 start");

        // method1에서 넘어온 data1과 동일한 객체 참조
        System.out.println("data.value : " + data2.getValue());
        System.out.println("method2 end");
    }
}
