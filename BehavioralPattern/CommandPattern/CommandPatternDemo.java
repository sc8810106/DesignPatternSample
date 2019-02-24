package BehavioralPattern.CommandPattern;

/**
 * Created by Administrator on 2019/2/24.
 */
public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock abcStock = new Stock();
        Buy buyOrder = new Buy(abcStock);
        Sell sellOrder = new Sell(abcStock);
        OrderExecutor orderExecutor = new OrderExecutor();
        orderExecutor.addOrder(buyOrder);
        orderExecutor.addOrder(sellOrder);
        orderExecutor.executeOrders();
    }

}
