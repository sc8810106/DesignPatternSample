package StructuralPattern.AdapterPattern;

/**
 * Created by Administrator on 2019/2/24.
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("vlc", "alone.vlc");
        audioPlayer.play("mp4", "hero.mp4");
        audioPlayer.play("avi", "sex.avi");
    }
}
