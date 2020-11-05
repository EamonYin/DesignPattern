package Factory.impl;

import Factory.Operation;

/**
 * @author:YiMing
 * @create:2020/11/5,16:15
 * @version:1.0
 */
public class OperationAdd implements Operation {
    @Override
    public int Result(int a, int b) {
        return a + b;
    }

    public OperationAdd(int a , int b){
        int result = Result(a, b);
        System.out.println(result);
    }
}
