package Builder;

/**
 * @author:YiMing
 * @create:2020/11/26,20:22
 * @version:1.0
 */
public abstract class ColdDrink implements Item{
    @Override
    public abstract String name();

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract double price();
}
