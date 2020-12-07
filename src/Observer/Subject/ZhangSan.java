package Observer.Subject;

/**
 * @author:YiMing
 * @create:2020/12/7,22:25
 * @version:1.0
 */ //员工-张三
public class ZhangSan implements Subject{

    @Override
    public void state() {
        System.out.print("看股票");
    }

    @Override
    public void name() {
        System.out.print("张三: ");
    }

    @Override
    public void show() {
        name();
        state();

    }
}
