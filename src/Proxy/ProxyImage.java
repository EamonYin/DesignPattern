package Proxy;

/**
 * @author:YiMing
 * @create:2020/11/9,10:29
 * @version:1.0
 *
 * 装饰模式强调的是添加职责，而代理模式强调的是间接访问
 */
public class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
