package Factory;

/**
 * @author:YiMing
 * @create:2020/11/5,16:18
 * @version:1.0
 * 简单工厂模式
 */
public class FactoryPatternDemo{
    public static void main(String[] args) {
        OperationFactory of = new OperationFactory();
        of.getOperation("+",1,2);
        of.getOperation("*",2,3);
        of.getOperation("*",6,10);
    }
}
