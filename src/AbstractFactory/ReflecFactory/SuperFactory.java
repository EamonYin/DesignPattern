package AbstractFactory.ReflecFactory;


import AbstractFactory.AbstractFactory;
import AbstractFactory.EarPhone;
import AbstractFactory.Phone;

/**
 * @author:YiMing
 * @create:2020/12/16,16:35
 * @version:1.0 利用反射机制优化抽象工厂模式
 */
public class SuperFactory {
    public static String pack = "AbstractFactory";
    public static String className = null;

    public void setClassName(String name) {
        this.className = name;
    }

    public static EarPhone CreatEarPhone() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String classPosition = pack + "." + className;
        Class<?> aClass = Class.forName(classPosition);
        Object o = aClass.newInstance();
        return (EarPhone) o;
    }

    public static Phone CreatPhone() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String classPosition = pack + "." + className;
        Class<?> aClass = Class.forName(classPosition);
        Object o = aClass.newInstance();
        return (Phone) o;
    }
}
