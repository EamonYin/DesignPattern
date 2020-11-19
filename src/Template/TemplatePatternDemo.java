package Template;

/**
 * @author:YiMing
 * @create:2020/11/19,20:35
 * @version:1.0
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {
        XiaoMing xiaoMing = new XiaoMing();
        ZhangSan zhangSan = new ZhangSan();

        System.out.println("小名的答卷：");
        xiaoMing.Printing();
        System.out.println("张三的答卷：");
        zhangSan.Printing();
    }
}
