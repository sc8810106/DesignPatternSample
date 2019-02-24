package BehavioralPattern.StrategyPattern;

/**
 * Created by Administrator on 2019/2/24.
 */
public class OperationMinus implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
