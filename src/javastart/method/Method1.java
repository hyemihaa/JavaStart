package javastart.method;

public class Method1 {

    public static void main(String[] args) {
        // 계산1
        int sum1 = add(5, 10); // 메서드 호출
        System.out.println("결과1출력 : " + sum1);

        int sum2 = add(2, 12);
        System.out.println("결과2출력 : " + sum2);
    }

    public static int add(int a, int b) { // 메서드 선언
        System.out.println(a + " + " + b + " 연산 수행");
        int sum = a + b;
        return sum; // 변수에 들어있는 값 반환
    }

    /*
    * 메서드 호출과 용어정리
    * 메서드 호출시
    *  -> 메서드에 넘기는 값(아규먼트=인수=인자)와 매개변수(파라미터)의 타입이 맞아야 한다.
    *  -> 매개변수의 순서와 갯수도 동일해야 한다.*/
}
