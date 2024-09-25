package javabasic.access.b;

import javabasic.access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        // public 호출
        data.publicField = 100;
        data.publicMethod();

        // 다른 패키지 default 호출 불가
//        data.defaultField = 200;
//        data.defaultMethod();

        // private 호출 불가
//        data.privateField = 300;
//        data.privateMethod();

        // public 메서드 호출
        data.innerAccess();
    }
}
