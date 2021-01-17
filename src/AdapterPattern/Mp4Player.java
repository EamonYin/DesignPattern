package AdapterPattern;

/**
 * @author:YiMing
 * @create:2021/1/17,21:43
 * @version:1.0
 */
public class Mp4Player implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        // Don't do anything
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
