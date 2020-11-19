package Template;

/**
 * @author:YiMing
 * @create:2020/11/19,20:24
 * @version:1.0
 */
public abstract class Examination {
    void SubjectA() {
        System.out.print("题目1：XXXX，答案是：");
    }

    void SubjectB() {
        System.out.print("题目Two：XXXX，答案是：");
    }

    void SubjectC() {
        System.out.print("题目III：XXXX，答案是：");
    }

    abstract void ResultA();
    abstract void ResultB();
    abstract void ResultC();

    public final void Printing() {
        SubjectA();
        ResultA();

        SubjectB();
        ResultB();

        SubjectC();
        ResultC();
    }
}
