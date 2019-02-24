package BehavioralPattern.StrategyPattern;

/**
 * Created by Administrator on 2019/2/24.
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Executor executor = new Executor(new OperationAdd());
        System.out.println("10 + 5 = " + executor.executeStrategy(10, 5));

        executor = new Executor(new OperationMinus());
        System.out.println("10 - 5 = " + executor.executeStrategy(10, 5));

        executor = new Executor(new OperationMultiply());
        System.out.println("10 * 5 = " + executor.executeStrategy(10, 5));
    }
}
