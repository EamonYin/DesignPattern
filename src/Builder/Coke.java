package Builder;

/**
 * @author:YiMing
 * @create:2020/11/26,20:25
 * @version:1.0
 */
public class Coke extends ColdDrink{
    @Override
    public String name() {
        return "可口可乐";
    }

    @Override
    public double price() {
        return 11;
    }
}
