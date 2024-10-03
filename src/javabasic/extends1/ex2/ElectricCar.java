package javabasic.extends1.ex2;

// 자식 클래스(서브 클래스) : 부모 클래스로 부터 필드와 메서드를 상속받는 클래스
public class ElectricCar extends Car {

    public void charge() {
        System.out.println("충전합니다");
    }
}

/*상속은 기존 클래스의 필드와 메소드를 새로운 클래스에서 재사용하게 해준다
* -> 기존 클래스의 속성과 기늘을 그대로 물려받는 것
* extends 키워드 사용!
* 단일 상속 : extends 대상은 하나만 선택!!! -> 자식은 하나의 부모만 가진다!
*/
