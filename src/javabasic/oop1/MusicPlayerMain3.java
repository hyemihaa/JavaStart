package javabasic.oop1;

public class MusicPlayerMain3 {

    // 절차 지향 프로그래밍 -> 데이터를 묶어서 관리 & 기능을 메서드로 추출(기능의 모듈화)
    // 중복 제거, 변경 영향 범위 : 기능 수정시 해당 메서드의 내부만 변경, 메서드 이름(코드 쉽게 이해)

    // 절차 지향 프로그래밍의 한계
    // 데이터와 메서드(기능)의 분리 : 데이터 쪽에 수정 -> 데이터와 관련된 메서드도 모두 수정해야 함
    
    // 객체 지향 프로그래밍 -> 데이터와 기능을 온전히 하나로 묶어서 사용

    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();
        // 음악 플레이어 켜기
        on(data);
        // 볼륨 증가
        volumeUp(data);
        // 볼륨 증가
        volumeUp(data);
        // 볼륨 감소
        volumeDown(data);
        // 음악 플레이어 상태
        showStatus(data);
        // 음악 플레이어 끄기
        off(data);
    }

    // 메서드 추출
    // 음악 플레이어 켜기
    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    // 음악 플레이어 끄기
    static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    // 음악 플레이어 볼륨 높이기
    static void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("음악 플레이어 볼륨 : " + data.volume);
    }

    // 음악 플레이어 볼륨 줄이기
    static void volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("음악 플레이어 볼륨 : " + data.volume);
    }

    // 음악 플레이어 상태
    static void showStatus(MusicPlayerData data) {
        System.out.println("음악 플레이어 상태 확인");
        if (data.isOn) {
            System.out.println("음악 플레이어 On, volume = " + data.volume);
        } else {
            System.out.println("음악 플레이어 off");
        }
    }
}
