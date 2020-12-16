package AbstractFactory;

/**
 * @author:YiMing
 * @create:2020/12/15,17:25
 * @version:1.0
 */
public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {
        BeiJingFactory beiJingFactory = new BeiJingFactory();
        EarPhone earPhone = beiJingFactory.GetEarPhone();
        earPhone.name();
        Phone phone = beiJingFactory.GetPhone();
        phone.name();
        ShenZhenFactory shenZhenFactory = new ShenZhenFactory();
    }
}
