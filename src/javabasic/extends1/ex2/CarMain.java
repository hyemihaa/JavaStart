package javabasic.extends1.ex2;

public class CarMain {

    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move(); // 부모 메서드 호출
        electricCar.charge(); // 자식 메서드 호출

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
    }

    /*
     *** 상속과 메모리 구조 ***
     * * 상속 관계의 객체를 생성하면 그 내부에는 부모와 자식 모두 생성
     * Ex) new ElectricCar() 호출 : ElectricCar(자식), Car(부모) 인스턴스 모두 생성 -> 참조값은 하나이며 두 클래스 정보가 공존함
     * * 상속 관계의 객체를 호출할 때, 대상 타입을 정해야 한다. 이때 호출자의 타입을 통해 대상 타입을 찾는다
     * * 현재 타입에서 기능을 찾지 못하면 상위 부모 타입으로 기능을 찾아서 실행, 기능을 찾지 못하면 컴파일 오류
     * electricCar.charge() 호툴 : 호출하는 변수의 타입(클래스)을 첫번째로 본다 -> ElectricCar 타입
     * electricCar.move() 호출 : 호출된 변수 타입에 없다면 부모 타입에서 찾음
    */

}
