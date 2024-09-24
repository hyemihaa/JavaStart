package javabasic.construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter) {
        // this 생략 가능 : 변수를 찾을 때 가까운 지역변수(매개변수 = 지역변수)를 먼저 찾고
        // 그 다음으로 멤버 변수(nameField)를 찾는다.
        nameField = nameParameter;
    }

}
