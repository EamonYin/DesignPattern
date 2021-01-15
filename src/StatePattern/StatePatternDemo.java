package StatePattern;

/**
 * @author:YiMing
 * @create:2021/1/15,17:16
 * @version:1.0
 */
public class StatePatternDemo {
    public static void main(String[] args) {
        SportsMan sportsManState = new SportsMan();
        GoodState goodState = new GoodState();
        goodState.doAction(sportsManState);
        System.out.println(sportsManState.getState());
        System.out.println("-----------------");
        BadState badState = new BadState();
        badState.doAction(sportsManState);
        System.out.println(sportsManState.getState());
    }
}
