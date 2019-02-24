package BehavioralPattern.StatePattern;

/**
 * Created by Administrator on 2019/2/24.
 */
public class StatePatternDemo {

    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.act(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.act(context);

        System.out.println(context.getState().toString());
    }
}
