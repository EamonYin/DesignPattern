package Observer.Subject;

/**
 * @author:YiMing
 * @create:2020/12/7,22:25
 * @version:1.0
 */ //员工-王五
public class WangWu implements Subject{

    @Override
    public void state() {
        System.out.print("看NBA");
    }

    @Override
    public void name() {
        System.out.print("王五: ");
    }

    @Override
    public void show() {
        name();
        state();

    }
}
