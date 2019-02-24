package BehavioralPattern.ObserverPattern;

/**
 * Created by Administrator on 2019/2/24.
 */
public class KidObserver extends Observer {

    public KidObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Kid is watching: " + subject.getState());
    }
}
