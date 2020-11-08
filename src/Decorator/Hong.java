package Decorator;

/**
 * @author:YiMing
 * @create:2020/11/8,19:04
 * @version:1.0
 */
public class Hong implements Person{
    @Override
    public void PersonName() {
        System.out.println("小红");
    }

    @Override
    public void PersonSex() {
        System.out.println("女生");
    }
}
