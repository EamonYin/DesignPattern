package Builder;

/**
 * @author:YiMing
 * @create:2020/11/26,20:25
 * @version:1.0
 */
public class MeatBurger extends Burger{
    @Override
    public String name() {
        return "荤汉堡";
    }

    @Override
    public double price() {
        return 30;
    }
}
