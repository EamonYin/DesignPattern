package AbstractFactory;


import AbstractFactory.ReflecFactory.SuperFactory;

/**
 * @author:YiMing
 * @create:2020/12/15,17:25
 * @version:1.0
 */
public class AbstractFactoryPatternDemo {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        BeiJingFactory beiJingFactory = new BeiJingFactory();
        EarPhone earPhone1 = beiJingFactory.GetEarPhone();
        earPhone1.name();
        Phone phone1 = beiJingFactory.GetPhone();
        phone1.name();
        ShenZhenFactory shenZhenFactory = new ShenZhenFactory();
        System.out.println("------------------反射+抽象工厂模式---------------------");
        //反射
        SuperFactory superFactory = new SuperFactory();
        superFactory.setClassName("EarPod");
        EarPhone earPhone = superFactory.CreatEarPhone();
        earPhone.name();
        superFactory.setClassName("MiPhone");
        Phone miphone = superFactory.CreatPhone();
        miphone.name();
        superFactory.setClassName("IPhone");
        Phone iphone = superFactory.CreatPhone();
        iphone.name();


    }
}
