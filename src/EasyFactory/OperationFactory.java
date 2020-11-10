package EasyFactory;

import EasyFactory.impl.OperationAdd;
import EasyFactory.impl.OperationMultiply;
import EasyFactory.impl.OperationSubtract;

/**
 * @author:YiMing
 * @create:2020/11/5,16:19
 * @version:1.0
 */
public class OperationFactory {
    public void getOperation(String oper,int a ,int b) {
        switch (oper) {
            case "+":
                new OperationAdd(a, b);
                break;
            case "-":
                new OperationSubtract(a, b);
                break;
            case "*":
                new OperationMultiply(a, b);
                break;
        }

    }
}
