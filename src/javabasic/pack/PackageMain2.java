package javabasic.pack;

import javabasic.pack.a.User;

public class PackageMain2 {

    public static void main(String[] args) {

        // 다른 패키지에 중복된 클래스가 있다면 하나만 import할 수 있다.
        // 나머진 풀네임을 적어야 한다.
        User userA = new User();

        javabasic.pack.b.User userB = new javabasic.pack.b.User();
    }
}
