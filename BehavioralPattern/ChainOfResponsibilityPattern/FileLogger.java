package BehavioralPattern.ChainOfResponsibilityPattern;

/**
 * Created by Administrator on 2019/2/24.
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
