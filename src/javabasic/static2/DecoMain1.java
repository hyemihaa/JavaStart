package javabasic.static2;

public class DecoMain1 {

    public static void main(String[] args) {
        String s = "hello java";

        //DecoUtil1 인스턴스 생성
        DecoUtil1 util = new DecoUtil1();
        String deco = util.deco(s);

        System.out.println("before: " + s);
        System.out.println("after: " + deco);
    }
}
