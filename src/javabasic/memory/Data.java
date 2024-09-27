package javabasic.memory;

public class Data {
    private int value; // 멤버 변수 : 힙 영역

    public Data(int value) { // 생성자 : method 영역
        this.value = value;
    }
    public int getValue() { // 메서드 : method 영역
        return value;
    }
}
