package Observer.Observer;

import Observer.Subject.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:YiMing
 * @create:2020/12/7,21:04
 * @version:1.0
 */
public interface Observer {
        void addSubject(Subject subject);
        void call();

}
