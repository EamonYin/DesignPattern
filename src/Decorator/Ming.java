package Decorator;

/**
 * @author:YiMing
 * @create:2020/11/8,19:05
 * @version:1.0
 */
public class Ming implements Person{

    @Override
    public void PersonName() {
        System.out.println("小名");
    }

    @Override
    public void PersonSex() {
        System.out.println("男生");
    }
}
