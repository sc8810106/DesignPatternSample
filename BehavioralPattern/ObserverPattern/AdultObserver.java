package BehavioralPattern.ObserverPattern;

/**
 * Created by Administrator on 2019/2/24.
 */
public class AdultObserver extends Observer {

    public AdultObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Adult is watching: " + subject.getState());
    }
}
