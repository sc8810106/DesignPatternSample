package BehavioralPattern.MementoPattern;

/**
 * Created by Administrator on 2019/2/24.
 */
public class MementoPatternDemo {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Administrator administrator = new Administrator();
        originator.setState("State #1");
        originator.setState("State #2");
        administrator.add(originator.saveStateToMemento());
        originator.setState("State #3");
        administrator.add(originator.saveStateToMemento());
        originator.setState("State #4");

        System.out.println("Current State: " + originator.getState());
        originator.getStateFromMemento(administrator.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getStateFromMemento(administrator.get(1));
        System.out.println("Second saved State: " + originator.getState());
    }
}
