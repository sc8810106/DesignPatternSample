package BehavioralPattern.ChainOfResponsibilityPattern;

/**
 * Created by Administrator on 2019/2/24.
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
