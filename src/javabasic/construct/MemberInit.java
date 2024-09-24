package javabasic.construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    
    // 멤버 초기화 메서드 추가
    void initMember(String name, int age, int grade) {
        // this. : 자기 자신의 인스턴스를 가리킴
        // 멤버 변수와 지역 변수가 중복될 때 this 필수
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
