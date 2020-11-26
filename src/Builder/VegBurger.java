package Builder;

/**
 * @author:YiMing
 * @create:2020/11/26,20:23
 * @version:1.0
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "素汉堡";
    }

    @Override
    public double price() {
        return 15;
    }
}
