package javastart.loop;

public class LoopEx {

    public static void main(String[] args) {
        int count = 0;

        while (count < 3) {
            count++;
            System.out.println("현재 숫자는 : " + count);
        }

        System.out.println("=================while================");
        int sum = 0;
        int i = 1;

        while (i < 5) {
            sum += i;
            i++;
            System.out.println("값 : " + sum);
        }
        System.out.println("결과 : " + sum);

        System.out.println("=================while================");

        int sum2 = 0;
        int j = 1;

        while (true) {
            sum2 += i;
            if (sum2 > 10) {
                System.out.println("합이 10보다 크면 종료 : i = " + i + " sum = " + sum2);
                break;
            }
        }

        System.out.println("==============for=============");

        int sum3 = 0;
        for (int z = 0; z <= 5; z++) {
            sum3 += z;
            System.out.println("z = " + z + " sum = " + sum3);
        }

        System.out.println("==============for=============");

        int sum4 = 0;
        for (int num = 0; ; num++) {
            sum4 += num;
            if (sum4 > 10) {
                System.out.println("합이 10보다 크면 종료 : i = " + i + " sum = " + sum4);
                break;
            }
        }

        System.out.println("==============중첩for=============");
        for (int z = 0; z < 2; z++) {
            System.out.println("외부 for 시작 z : " + z);
            for (int k = 0; k < 3; k++) {
                System.out.println("-> 내부 for  k : " + k);
            }
            System.out.println("외부 for 종료 z : " + z);
            System.out.println();

        }




    }
}
