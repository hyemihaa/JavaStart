package loop.ex;

public class LoopEx2 {

    public static void main(String[] args) {
        System.out.println("==========while1==========");
        int count = 1;

        while (count < 11) {
            System.out.println(count++);
        }

        System.out.println("==========while2==========");
        int num2 = 2;
        int count2 = 1;
        while (count2 <= 10) {
            System.out.println("짝수 : " + num2);
            num2 += 2;
            count2++;
        }
        System.out.println("==========while3==========");

        int max = 100;

        int sum = 0;
        int i = 1;
        while (i <= max) {
            sum += i;
            i++;
        }
        System.out.println("sum = " + sum);

        System.out.println("==========for==========");
        for (int num = 1; num < 11; num++) {
            System.out.println(num);
        }

        System.out.println("==========for2==========");
        int num3 = 2;
        for (int count3 = 1; count3 <= 10; count3++) {
            System.out.println("짝수 : " + num3);
            num3 += 2;
        }

        System.out.println("==========for3==========");
        int max2 = 100;

        int sum2 = 0;
        for (int j = 1; j <= max2; j++) {
            sum2 += j;
        }
        System.out.println(sum2);
    }
}
