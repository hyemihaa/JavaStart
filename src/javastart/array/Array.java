package javastart.array;

public class Array {

    public static void main(String[] args) {
//        int[] students; // 배열 변수 선언
//        students = new int[5];
//
//        // 변수 값 대입
//        students[0] = 90;
//        students[1] = 80;
//        students[2] = 70;
//        students[3] = 60;
//        students[4] = 50;

        // 배열 생성과 초기화
//        int[] students = new int[]{90, 80, 70, 60, 50};

        // 배열의 편리한 초기화
        int[] students = {90, 80, 70, 60, 50};

        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i+1) + "의 점수 = " + students[i]);
        }
    }
}
