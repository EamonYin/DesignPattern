package EasyFactory.impl;

import EasyFactory.Operation;

/**
 * @author:YiMing
 * @create:2020/11/5,16:16
 * @version:1.0
 */
public class OperationMultiply implements Operation {
    @Override
    public int Result(int a, int b) {
        return a * b;
    }
    public OperationMultiply(int a,int b){
        int result = Result(a, b);
        System.out.println(result);
    }
}
