package Strategy;

import Strategy.impl.OperationAdd;
import Strategy.impl.OperationDivision;
import Strategy.impl.OperationMultiply;
import Strategy.impl.OperationSubtract;

/**
 * @author:YiMing
 * @create:2020/11/5,15:29
 * @version:1.0
 * 策略模式
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context contextadd = new Context(new OperationAdd());
        System.out.println("5 + 10 =" + contextadd.executeStrategy(5, 10));

        Context contextsub = new Context(new OperationSubtract());
        System.out.println("5 - 10 = " + contextsub.executeStrategy(5,10));

        Context contextmul = new Context(new OperationMultiply());
        System.out.println("5 * 10 =" + contextmul.executeStrategy(5,10));

        Context contextDiv = new Context(new OperationDivision());
        System.out.println("10 / 5 =" + contextDiv.executeStrategy(10,5));
    }
}
