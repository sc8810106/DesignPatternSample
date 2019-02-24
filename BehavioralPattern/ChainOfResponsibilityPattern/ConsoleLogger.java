package BehavioralPattern.ChainOfResponsibilityPattern;

/**
 * Created by Administrator on 2019/2/24.
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
