package Factory.impl;

import Factory.Operation;

/**
 * @author:YiMing
 * @create:2020/11/5,16:17
 * @version:1.0
 */
public class OperationSubtract implements Operation {
    @Override
    public int Result(int a, int b) {
        return a - b;
    }
    public OperationSubtract(int a,int b){
        int result = Result(a, b);
        System.out.println(result);
    }
}
