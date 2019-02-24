package BehavioralPattern.CommandPattern;

/**
 * Created by Administrator on 2019/2/24.
 */
public class Sell implements Order {
    private Stock abcStock;

    public Sell(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}
