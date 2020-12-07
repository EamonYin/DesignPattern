package Observer.Observer;

import Observer.Subject.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:YiMing
 * @create:2020/12/7,22:26
 * @version:1.0
 */ //观察者-老板
public class Boss implements Observer{

    List<Subject> lists =  new ArrayList<Subject>();

    @Override
    public void addSubject(Subject subject) {
        lists.add(subject);
    }

    @Override
    public void call() {
        for (Subject sub: lists) {
            sub.show();
            System.out.println("【Boss】提醒你快点工作！");
        }
    }
}
