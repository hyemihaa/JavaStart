package javabasic.pack;

import javabasic.pack.a.User;

public class PackageMain1 {

    public static void main(String[] args) {
        Data data = new Data(); // 같은 패키지
//      javabasic.pack.a.User user = new javabasic.pack.a.User(); // 다른 위치의 패키지 -> 풀네임

        User user = new User(); // 다른 위치의 패키지 -> import
    }
}
