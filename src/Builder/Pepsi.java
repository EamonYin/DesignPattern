package Builder;

/**
 * @author:YiMing
 * @create:2020/11/26,20:26
 * @version:1.0
 */
public class Pepsi extends ColdDrink{
    @Override
    public String name() {
        return "可口可乐";
    }

    @Override
    public double price() {
        return 7;
    }
}
