package BehavioralPattern.StatePattern;

/**
 * Created by Administrator on 2019/2/24.
 */
public class StopState implements State {

    @Override
    public void act(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    @Override
    public String toString(){
        return "Stop State";
    }
}
