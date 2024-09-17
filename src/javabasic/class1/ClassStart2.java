package javabasic.class1;

public class ClassStart2 {

    public static void main(String[] args) {
        Student student1; // Student 타입을 받을수 있는 변수 선언
        student1 = new Student(); // 객체(=인스턴스) 생성(new)
        // student1 = x001; --> 변수에 생성된 인스턴스(객체)의 참조값(메모리 주소) 보관
        // student1 변수를 통해 메모리에 있는 실제 객체를 접근, 사용
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student(); // x002 참조값 생성
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println("이름 : " + student1.name + " 나이 : " + student1.age + " 성적 : " + student1.grade);
        System.out.println("이름 : " + student2.name + " 나이 : " + student2.age + " 성적 : " + student2.grade);


    }
}
