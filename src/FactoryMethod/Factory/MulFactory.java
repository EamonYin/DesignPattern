package FactoryMethod.Factory;

import FactoryMethod.Product.Mul;
import FactoryMethod.Product.Operation;

/**
 * @author:YiMing
 * @create:2020/11/10,22:05
 * @version:1.0
 */
public class MulFactory implements Factory{
    @Override
    public Operation createOperation() {
        System.out.println("乘法运算");
        return new Mul();
    }
}
