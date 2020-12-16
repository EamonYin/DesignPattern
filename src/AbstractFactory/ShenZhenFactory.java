package AbstractFactory;

/**
 * @author:YiMing
 * @create:2020/12/15,17:28
 * @version:1.0
 */
public class ShenZhenFactory implements AbstractFactory{
    @Override
    public Phone GetPhone() {
        return new MiPhone();
    }

    @Override
    public EarPhone GetEarPhone() {
        return new EarPod();
    }
}
