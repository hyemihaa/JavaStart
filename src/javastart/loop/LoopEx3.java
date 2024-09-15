package javastart.loop;

public class LoopEx3 {

    public static void main(String[] args) {

        //구구단
        int num = 0;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                num = i * j;
                System.out.println(i + " * " + j + " = " + num);
            }
        }

        System.out.println("============별찍기============");

        int rows = 10;
        for (int k = 1; k <= rows; k++) {
            for (int z = 1; z <= k; z++) {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
