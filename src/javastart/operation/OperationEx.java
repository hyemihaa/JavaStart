package javastart.operation;

public class OperationEx {

    public static void main(String[] args) {

        System.out.println("========== 1번 ==========");

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        int sum = num1 + num2 + num3;
        int avg = sum / 3;

        System.out.println("합 : " + sum);
        System.out.println("평균 = " + avg);

        System.out.println("========== 2번 ==========");

        double val1 = 1.5;
        double val2 = 2.5;
        double val3 = 3.5;

        double sum2 = val1 + val2 + val3;
        double average = sum2 / 3;

        System.out.println("합 : " + sum2);
        System.out.println("average = " + average);

        System.out.println("========== 3번 ==========");

        int score = 80;

        boolean result = score >= 80 && score <= 100;
        System.out.println("result = " + result);

    }




}
