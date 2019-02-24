package StructuralPattern.AdapterPattern;

/**
 * Created by Administrator on 2019/2/24.
 */
public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    @Override
    public void play(String mediaType, String fileName) {
        if (mediaType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 : " + fileName);
        } else if (mediaType.equalsIgnoreCase("vlc") || mediaType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(mediaType);
            mediaAdapter.play(mediaType, fileName);
        } else {
            System.out.println("Invalid mediaType : " + mediaType + " format not supported.");
        }
    }
}
