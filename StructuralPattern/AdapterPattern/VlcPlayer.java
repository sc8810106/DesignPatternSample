package StructuralPattern.AdapterPattern;

/**
 * Created by Administrator on 2019/2/24.
 */
public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc :" + fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
