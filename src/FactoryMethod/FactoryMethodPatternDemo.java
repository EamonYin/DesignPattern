package FactoryMethod;

import FactoryMethod.Factory.AddFactory;
import FactoryMethod.Factory.Factory;
import FactoryMethod.Factory.MulFactory;
import FactoryMethod.Factory.SubFactory;
import FactoryMethod.Product.Mul;
import FactoryMethod.Product.Operation;

/**
 * @author:YiMing
 * @create:2020/11/10,22:01
 * @version:1.0
 *
 * 工厂方法模式解决了简单工厂模式违反 “开闭原则（修改关闭；添加开启）”
 */
public class FactoryMethodPatternDemo {
    public static void main(String[] args) throws Exception {
        //加法
        AddFactory addFactory = new AddFactory();
        Operation add = addFactory.createOperation();
        System.out.println(add.getResult(1,2));

        //减法(反射机制)
        Factory subFactory = (Factory) Class.forName("FactoryMethod.Factory.SubFactory").newInstance();
        Operation sub = subFactory.createOperation();
        System.out.println(sub.getResult(3,5));

        //乘法
        MulFactory mulFactory = new MulFactory();
        Operation mul = mulFactory.createOperation();
        System.out.println(mul.getResult(3,6));

        //除法
        Factory divFactory = (Factory) Class.forName("FactoryMethod.Factory.DivFactory").newInstance();
        Operation div = divFactory.createOperation();
        System.out.println(div.getResult(1,0));
    }
}
