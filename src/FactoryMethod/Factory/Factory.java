package FactoryMethod.Factory;

import FactoryMethod.Product.Operation;

/**
 * @author:YiMing
 * @create:2020/11/10,22:03
 * @version:1.0
 */
public interface Factory {
    public Operation createOperation() ;
}
