package Proxy;

/**
 * @author:YiMing
 * @create:2020/11/9,10:34
 * @version:1.0
 */
public class ProxyPatternDemo {
    public static void main(String[] args) {
        ProxyImage proxyImage = new ProxyImage("小名画的抽象画");

        ProxyImage2 proxyImage2 = new ProxyImage2("小红的素描");

        // 图像将从磁盘加载
        proxyImage.display();
        System.out.println(" ");
        // 图像不需要从磁盘加载
        proxyImage.display();
        System.out.println("---------------------------------");
        proxyImage2.display();
        System.out.println();
        proxyImage2.display();
    }
}
