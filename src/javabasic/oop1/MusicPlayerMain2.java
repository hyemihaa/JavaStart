package javabasic.oop1;

public class MusicPlayerMain2 {

    // 절차지향 프로그래밍 -> 데이터를 묶어서 관리
    // 다른 변수가 추가되더라도 음악플레이어 관련 변수들은 MusicPlayerData에 따로 속해 있어 구분하기 쉬워짐
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        // 음악 플레이어 켜기
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");

        // 볼륨 증가
        data.volume++;
        System.out.println("음악 플레이어 볼륨 : " + data.volume);
        // 볼륨 증가
        data.volume++;
        System.out.println("음악 플레이어 볼륨 : " + data.volume);
        // 볼륨 감소
        data.volume--;
        System.out.println("음악 플레이어 볼륨 : " + data.volume);
        // 음악 플레이어 상태
        System.out.println("음악 플레이어 상태 확인");
        if (data.isOn) {
            System.out.println("음악 플레이어 상태 On, 볼륨: " + data.volume);
        } else {
            System.out.println("음악 플레이어 상태 Off");

        }

        // 음악 플레이어 끄기
        data.isOn = false;
        System.out.println("음악 플레이어 종료");
    }
}
