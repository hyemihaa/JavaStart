package method.ex;

public class MethodExRef1 {

    public static void main(String[] args) {

        double average1 = average(1, 2, 3);
        System.out.println("평균값 : " + average1);

        double average2 = average(15, 25, 35);
        System.out.println("평균값 : " + average2);
    }

    public static double average(int a, int b, int c) {
        int sum = a + b + c;
        return sum / 3.0;
    }

}
