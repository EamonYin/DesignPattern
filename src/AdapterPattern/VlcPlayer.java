package AdapterPattern;

/**
 * @author:YiMing
 * @create:2021/1/17,21:41
 * @version:1.0
 */
public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        // Don't do anything
    }
}
