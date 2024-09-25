package javabasic.access.ex;

public class MaxCounter {
    private int count;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        // 검증로직을 통과 하지 못하면 -> 메서드 종료 
        // 통과하면 실행 로직
        if (count >= max) {
            System.out.println("최대값을 초과할 수 없습니다.");
            return;
        }
        // 실행 로직
        count++;
    }

    // 위와 같은 기능을 하는 로직
//    public void increment() {
//        if (count >= max) {
//            System.out.println("최대값을 초과할 수 없습니다.");
//        } else{
//            count++;
//        }
//    }

    public int getCount() {
        return count;
    }
}
