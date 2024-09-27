package javabasic.static2.ex;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car("k5");
        Car car2 = new Car("sonata");
        Car car3 = new Car("G80");

        Car.showTotalCars(); // 구매한 차량 수 출력
    }
}

