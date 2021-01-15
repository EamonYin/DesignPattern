package StatePattern;

/**
 * @author:YiMing
 * @create:2021/1/15,17:29
 * @version:1.0
 */
public class BadState implements State{
    @Override
    public void doAction(SportsMan context) {
        System.out.println("运动员现在状态不好");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "状态不好";
    }
}
