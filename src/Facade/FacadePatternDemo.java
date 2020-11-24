package Facade;

/**
 * @author:YiMing
 * @create:2020/11/24,21:43
 * @version:1.0
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.MethodA();
        System.out.println("----------------------");
        facade.MethodB();
    }
}
