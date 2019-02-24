package BehavioralPattern.StatePattern;

/**
 * Created by Administrator on 2019/2/24.
 */
public class StartState implements State {

    @Override
    public void act(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    @Override
    public String toString(){
        return "Start State";
    }
}
