package Observer.Observer;

import Observer.Subject.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:YiMing
 * @create:2020/12/7,22:26
 * @version:1.0
 */ //观察者-前台
public class Reception implements Observer{

    List<Subject> lists =  new ArrayList<Subject>();

    @Override
    public void addSubject(Subject subject) {
        lists.add(subject);
    }

    @Override
    public void call() {
        for (Subject sub: lists) {
            sub.show();
            System.out.println("【前台】提醒你老板来了！");
        }
    }
}
