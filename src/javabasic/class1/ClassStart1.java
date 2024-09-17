package javabasic.class1;

public class ClassStart1 {

    public static void main(String[] args) {
        // 배열 사용 -> 코드변경 최소화 성공 
        // 문제 -> 한 학생의 데이터가 3개의 배열에 나누어져 있어 -> 데이터 변경이 어려움

        String[] studentNames = {"학생1", "학생2"};
        int[] studentAge = {15, 16};
        int[] studentGrade = {90, 80};

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("이름 : " + studentNames[i] + " 나이 : " + studentAge[i] + " 성적 : " + studentGrade[i]);
        }
        
//        String student1Name = "학생1";
//        String student1Age = "15";
//        String student1Grade = "90";
//
//        String student2Name = "학생2";
//        String student2Age = "16";
//        String student2Grade = "80";
//
//        System.out.println("이름 : " + student1Name + " 나이 : " + student1Age + " 성적 : " + student1Grade);
//        System.out.println("이름 : " + student2Name + " 나이 : " + student2Age + " 성적 : " + student2Grade);
    }
}
