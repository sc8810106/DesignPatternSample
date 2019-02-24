package BehavioralPattern.ObserverPattern;

/**
 * Created by Administrator on 2019/2/24.
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new KidObserver(subject);
        new AdultObserver(subject);
        new OldObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
