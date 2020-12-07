package Observer.Subject;

/**
 * @author:YiMing
 * @create:2020/12/7,22:25
 * @version:1.0
 */ //员工-赵六
public class ZhaoLiu implements Subject{

    @Override
    public void state() {
        System.out.print("打王者荣耀");
    }

    @Override
    public void name() {
        System.out.print("赵六: ");
    }

    @Override
    public void show() {
        name();
        state();

    }
}
