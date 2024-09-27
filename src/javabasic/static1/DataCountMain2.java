package javabasic.static1;

public class DataCountMain2 {
    public static void main(String[] args) {

        Data2 data1 = new Data2("A");
        System.out.println("A count = " + Data2.count);

        Data2 data2 = new Data2("B");
        System.out.println("B count = " + Data2.count);
    }
}
