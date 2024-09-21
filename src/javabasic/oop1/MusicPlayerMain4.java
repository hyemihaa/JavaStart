package javabasic.oop1;

public class MusicPlayerMain4 {

    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();

        // 음악 플레이어 켜기
        musicPlayer.on();
        // 볼륨 증가
        musicPlayer.volumeUp();
        musicPlayer.volumeUp();
        musicPlayer.volumeUp();
        musicPlayer.volumeUp();
        musicPlayer.volumeUp();
        // 볼륨 감소
        musicPlayer.volumeDown();
        // 플레이어 상태
        musicPlayer.showStatus();
        // 플레이어 종료
        musicPlayer.off();

    }
}
