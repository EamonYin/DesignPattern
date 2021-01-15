package StatePattern;

/**
 * @author:YiMing
 * @create:2021/1/15,17:27
 * @version:1.0
 */
public class GoodState implements State{
    @Override
    public void doAction(SportsMan context) {
        System.out.println("运动员处于良好状态");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "状态良好";
    }
}
