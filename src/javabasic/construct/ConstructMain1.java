package javabasic.construct;

public class ConstructMain1 {

    public static void main(String[] args) {

        // 생성자는 인스턴스(객체)를 생성하고 나서 즉시 호출 됨
        // 생성자 호출은 new 명령어 다음에 생성자 이름과 매개변수에 맞추에 인수 전달
        // new 생성자이름(생성자에 맞는 인수 목록)
        // new 클래스이름(생성자에 맞는 인수 목록)
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 16, 80);

        MemberConstruct[] member = {member1, member2};
        
        for (MemberConstruct m : member) {
            System.out.println("이름 : " + m.name + " 나이 : " + m.age + " 성적 : " + m.grade);

        }
    }
}
