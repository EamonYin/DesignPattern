package Proxy;

/**
 * @author:YiMing
 * @create:2020/11/9,10:25
 * @version:1.0
 */
public class RealImage implements Image {
    public String PhotoName;

    public RealImage(String pn) {
        this.PhotoName = pn;
        loadFromDisk(PhotoName);
    }

    @Override
    public void display() {
        System.out.println("Display" + PhotoName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("loadFromDisk" + fileName);
    }
}
