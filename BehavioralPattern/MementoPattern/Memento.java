package BehavioralPattern.MementoPattern;

/**
 * Created by Administrator on 2019/2/24.
 */
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
