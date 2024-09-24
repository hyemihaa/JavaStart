package javabasic.construct;

public class MemberDefault {
    String name;

    // 기본생성자
    public MemberDefault() {
        System.out.println("생성자 호출");
    }

    // 자바는 생성자가 없을 경우 기본 생성자를 자체적으로 만들어 준다
    // 생성자가 하나라도 있으면 기본 생성자 제공 X
}
