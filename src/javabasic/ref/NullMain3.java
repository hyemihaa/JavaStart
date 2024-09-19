package javabasic.ref;

public class NullMain3 {

    public static void main(String[] args) {
        BigData bigData = new BigData(); // x001
        System.out.println("bigData.count = " + bigData.count); // 0
        System.out.println("bigData.data = " + bigData.data); // null -> 참조형은 초기값 null

                                // x001.data = null -> null.value(참조할 곳 X) -> NullPointerException
        System.out.println("bigData.data.value" + bigData.data.value);

    }
}
