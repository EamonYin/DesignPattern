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
    //超级工厂中 生产耳机的 耳机工厂
    public static EarPhone CreatEarPhone() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String classPosition = pack + "." + className;
        Class<?> aClass = Class.forName(classPosition);
        Object o = aClass.newInstance();
        return (EarPhone) o;
    }
    //超级工厂中 生产手机的 手机工厂
    public static Phone CreatPhone() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String classPosition = pack + "." + className;
        Class<?> aClass = Class.forName(classPosition);
        Object o = aClass.newInstance();
        return (Phone) o;
    }

    /**
     * 添加
     * 超级工厂中 生产充电器的 充电器工厂
     * 第一步：新建 充电器接口
     * 第二步：新建 各品牌充电器实体类
     * 第三步：在超级工厂类中添加 CreatCharger方法（反射）
     */

}
