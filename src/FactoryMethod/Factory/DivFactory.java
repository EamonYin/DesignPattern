package FactoryMethod.Factory;

import FactoryMethod.Product.Div;
import FactoryMethod.Product.Operation;

/**
 * @author:YiMing
 * @create:2020/11/10,22:06
 * @version:1.0
 */
public class DivFactory implements Factory{
    @Override
    public Operation createOperation() {
        System.out.println("除法运算");
        return new Div();
    }
}
