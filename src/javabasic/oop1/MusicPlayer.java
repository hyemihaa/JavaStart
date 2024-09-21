package javabasic.oop1;

// 음악 플레이어의 데이터와 기능을 하나로 묶어서 필요한 기능을 메서드를 통해 외부에 제공 -> 캡슐화
public class MusicPlayer {
    int volume;
    boolean isOn;

    void on() {
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    void off() {
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    void volumeUp() {
        volume++;
        System.out.println("볼륨 증가 : " + volume);
    }

    void volumeDown() {
        volume--;
        System.out.println("볼륨 감소 : " + volume);
    }

    void showStatus() {
        System.out.println("음악 플레이어 상태 확인");
        if (isOn) {
            System.out.println("음악 플레이어 ON, 현재 볼륨 : " + volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
