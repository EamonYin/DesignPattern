package FactoryMethod.Factory;

import FactoryMethod.Product.Add;
import FactoryMethod.Product.Operation;

/**
 * @author:YiMing
 * @create:2020/11/10,22:04
 * @version:1.0
 */
public class AddFactory implements Factory{
    @Override
    public Operation createOperation() {
        System.out.println("加法运算");
        return new Add();
    }
}
