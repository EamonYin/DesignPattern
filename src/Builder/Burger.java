package Builder;

/**
 * @author:YiMing
 * @create:2020/11/26,20:19
 * @version:1.0
 */
public abstract class Burger implements Item{
    public abstract String name();

    @Override
    public Packing packing() {
        return new PaperBox();
    }

    @Override
    public abstract double price();

}
