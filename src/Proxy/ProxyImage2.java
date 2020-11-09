package Proxy;

/**
 * @author:YiMing
 * @create:2020/11/9,11:01
 * @version:1.0
 */
public class ProxyImage2 implements Image {

    private RealImage realImage2;
    private String filename2;

    public ProxyImage2(String filename2) {
        this.filename2 = filename2;
    }

    @Override
    public void display() {
        if (realImage2 == null) {
            realImage2 = new RealImage(filename2);
        }
        realImage2.display();
    }
}
