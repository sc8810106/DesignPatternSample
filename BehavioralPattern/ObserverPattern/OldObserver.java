package BehavioralPattern.ObserverPattern;

/**
 * Created by Administrator on 2019/2/24.
 */
public class OldObserver extends Observer {

    public OldObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Old is watching: " + subject.getState());
    }
}
