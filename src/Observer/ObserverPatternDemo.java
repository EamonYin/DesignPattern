package Observer;


import Observer.Observer.Boss;
import Observer.Observer.Reception;
import Observer.Subject.LiSi;
import Observer.Subject.WangWu;
import Observer.Subject.ZhangSan;
import Observer.Subject.ZhaoLiu;

/**
 * @author:YiMing
 * @create:2020/12/7,22:10
 * @version:1.0
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        //员工
        ZhangSan zhangSan = new ZhangSan();
        LiSi liSi = new LiSi();
        WangWu wangWu = new WangWu();
        ZhaoLiu zhaoLiu = new ZhaoLiu();

        //老板
        Boss boss = new Boss();
        boss.addSubject(zhangSan);
        boss.call();

        //前台
        Reception reception = new Reception();
        reception.addSubject(liSi);
        reception.addSubject(wangWu);
        reception.addSubject(zhaoLiu);
        reception.call();

    }
}
