package BehavioralPattern.CommandPattern;

/**
 * Created by Administrator on 2019/2/24.
 */
public class Buy implements Order {
    private Stock abcStock;

    public Buy(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.buy();
    }
}
