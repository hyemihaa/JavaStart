package javabasic.access.a;

public class PublicClassInnerMain {
    public static void main(String[] args) {
        // public, default 모두 접근 가능
        PublicClass publicClass = new PublicClass();
        DefaultClass1 class1 = new DefaultClass1();
        DefaultClass2 class2 = new DefaultClass2();
    }
}
