package AbstractFactory;

/**
 * @author:YiMing
 * @create:2020/12/15,17:25
 * @version:1.0
 */
public class BeiJingFactory implements AbstractFactory{
    @Override
    public Phone GetPhone() {
        return new IPhone();
    }

    @Override
    public EarPhone GetEarPhone() {
        return new MiDots();
    }
}
