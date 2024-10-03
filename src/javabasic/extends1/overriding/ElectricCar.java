package javabasic.extends1.overriding;

public class ElectricCar extends Car {


    // 부모의 기능을 자식이 새로 재정의 하는 것 -> 메서드 오버라이딩
    // 하위 클래스에서 상위 클래스의 메서드를 재정의 하는것
    @Override
    public void move() {
        System.out.println("전기차를 빠르게 이동합니다");
    }

    public void charge() {
        System.out.println("충전합니다");
    }
}
