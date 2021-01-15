package StatePattern;

/**
 * @author:YiMing
 * @create:2021/1/15,17:24
 * @version:1.0
 */
public class SportsMan {
    public State state;

    public SportsMan() {
        state = null;
    }

    public void setState(State state) {
        this.state = state;
    }
    public State  getState(){
        return state;
    }
}
