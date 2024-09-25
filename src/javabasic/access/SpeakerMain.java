package javabasic.access;

public class SpeakerMain {

    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeDown();
        speaker.volumeDown();
        speaker.volumeDown();

        speaker.volumeUp();
        speaker.volumeUp();
        speaker.volumeUp();

        speaker.volumeUp();
        speaker.volumeUp();
        speaker.showVolume();

        // 필드에 직접 접근 (volumeUP 메서드에 최대 크기를 100으로 설정 해놨지만 직접 volume 필드에 접근해서 200으로 수정이 가능하다!!)
        System.out.println("volume 필드 직접 접근 수정");
      //  speaker.volume = 200; -> 접근제어자 private 변경 : 외부 접근 불가
        speaker.showVolume();

    }
}
