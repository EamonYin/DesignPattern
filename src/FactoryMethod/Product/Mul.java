package FactoryMethod.Product;

/**
 * @author:YiMing
 * @create:2020/11/10,21:48
 * @version:1.0
 */
public class Mul implements Operation {
    @Override
    public double getResult(double numberA, double numberB) throws Exception {
        return numberA * numberB;
    }
}
