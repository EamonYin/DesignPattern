package Strategy.impl;

import Strategy.Strategy;

/**
 * @author:YiMing
 * @create:2020/11/5,15:24
 * @version:1.0
 */
public class OperationSubtract implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
