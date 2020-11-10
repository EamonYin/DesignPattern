package FactoryMethod.Factory;

import FactoryMethod.Product.Operation;
import FactoryMethod.Product.Sub;

/**
 * @author:YiMing
 * @create:2020/11/10,22:05
 * @version:1.0
 */
public class SubFactory implements Factory{
    @Override
    public Operation createOperation() {
        System.out.println("减法运算");
        return new Sub();
    }
}
