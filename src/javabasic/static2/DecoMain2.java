package javabasic.static2;

public class DecoMain2 {

    public static void main(String[] args) {
        String s = "hello java";
        // 정적 메서드 사용 -> 객체 생성 없이 클래스명 + . (dot) + 메서드 명으로 바로 호출
        // 불필요한 객체 생성 없이 메서드 사용
        String deco = DecoUtil2.deco(s);

        System.out.println("before: " + s);
        System.out.println("after: " + deco);
    }
}
