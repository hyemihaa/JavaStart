package javabasic.static1;

public class Data1 {
    public String name;
    // 인스턴스 멤버 변수에 카운트 저장
    public int count;

    public Data1(String name) {
        this.name = name;
        count++;
    }
}
