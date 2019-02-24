package StructuralPattern.AdapterPattern;

/**
 * Created by Administrator on 2019/2/24.
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 : "+fileName);
    }
}
