package javabasic.construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 생성자의 이름은 클래스 이름과 같아야 함
    // 생성자는 반환 타입이 X
    // 나머지는 메서드와 같다

    // 생성자 오버로딩
    // 생성자 추가
    MemberConstruct(String name, int age) {
        this(name, age, 50); // 변경 --> 아래의 생성자 호출
        // this() : 생성자 내부에서 자신의 생성자를 호출
        // this => 자신의 참조값을 가리킨다. 그래서 자신의 생성자를 호출한다고 생각하면 됨
        // this()는 생성자 코드의 첫 줄에 적용
//        this.name = name;
//        this.age = age;
//        this.grade = 50;
    }

    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name = " + name + ", age" + age + ", grade" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
