package FactoryMethod.Product;

/**
 * @author:YiMing
 * @create:2020/11/10,21:49
 * @version:1.0
 */
public class Div implements Operation {
    @Override
    public double getResult(double numberA, double numberB) throws Exception {
        if (numberB == 0) {
            throw new Exception("除数不能为0");
        }
        return numberA / numberB;
    }
}
