package javabasic.static1;

public class Data2 {
    public String name;
    public static int count; // static 변수

    public Data2(String name) {
        this.name = name;
        count++; // 인스턴스 생성 시 count 증가
    }
}
