package Observer.Subject;

/**
 * @author:YiMing
 * @create:2020/12/7,22:25
 * @version:1.0
 */ //员工-李四
public class LiSi implements Subject{

    @Override
    public void state() {
        System.out.print("刷短视频");
    }

    @Override
    public void name() {
        System.out.print("李四: ");
    }

    @Override
    public void show() {
        name();
        state();

    }
}
