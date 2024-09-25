package javabasic.access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        // public 호출
        data.publicField = 100;
        data.publicMethod();

        // 같은 패키지 default 호출
        data.defaultField = 200;
        data.defaultMethod();

        // private 호출 불가
//        data.privateField = 300;
//        data.privateMethod();

        // public 메서드 호출
        data.innerAccess();
    }
}
