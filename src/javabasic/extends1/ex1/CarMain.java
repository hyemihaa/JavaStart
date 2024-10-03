package javabasic.extends1.ex1;

public class CarMain {

    /*
    * 전기차와 가솔린차는 자동차의 구체적인 개념
    * 자동차는 전기차와 가솔린차를 포함하는 추상적인 개념
    * --> 전기차와 가솔린차는 주유법만 다르고 이동하는것는 같다!!*/


    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
    }
}
