package javabasic.ref;

public class VarChange2 {

    public static void main(String[] args) {

        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA; // dataA에 있는 값이 아닌 참조값을 복사 -> 메서드 내부에 있는 멤버 변수를 변경 -> 호출자의 객체도 변경됨
                            // -> 쉽게 설명 하자면,
                            // A가 가지고 있는 주소(참조값)를 B에게 적어줌
                            // -> B가 주소로 찾아가 그안에 무엇인가를 바꾼다
                            // -> 그 후 A가 다시 그 주소로 찾아가면 B가 바꾼 값이 있다.

        System.out.println("dataA 참조값 = " + dataA); // x001
        System.out.println("datab 참조값 = " + dataB); // x001
        System.out.println("dataA.value = " + dataA.value); //10
        System.out.println("dataB.value = " + dataB.value); //10

        //dataA 변경
        dataA.value = 20;
        System.out.println("변경 dataA.value = 20");
        System.out.println("dataA.value = " + dataA.value); //20
        System.out.println("dataB.value = " + dataB.value); //20


        //dataB 변경
        dataB.value = 30;
        System.out.println("변경 dataB.value = 30");
        System.out.println("dataA.value = " + dataA.value); //30
        System.out.println("dataB.value = " + dataB.value); //30

    }

}
