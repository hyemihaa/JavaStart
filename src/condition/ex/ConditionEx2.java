package condition.ex;

public class ConditionEx2 {

    public static void main(String[] args) {
        double rating = 7.1;

        if (rating <= 9) {
            System.out.println("어바웃타임을 추천합니다");
        }
        if (rating <= 8) {
            System.out.println("토이스토리를 추천합니다");
        }
        if (rating <= 7) {
            System.out.println("고질라를 추천합니다");
        }

        System.out.println("=============================");

        String grade = "A";
        switch (grade) {
            case "A":
                System.out.println("탁월한 성과");
                break;
            case "B":
                System.out.println("좋은 성과");
                break;
            case "C":
                System.out.println("준수한 성과");
                break;
            case "D":
                System.out.println("모자란 성과");
                break;
            case "F":
                System.out.println("불합격");
                break;
            default:
                System.out.println("잘못된 학점");
        }

        System.out.println("=======================");

        int a = 10;
        int b = 20;

        int max = (a > b) ? a : b; 
        System.out.println("max = " + max);

        System.out.println("=======================");

        int x = 14;

        String result = (x % 2 == 0) ? "짝수" : "홀수";
        System.out.println("result = " + result);


    }
}
