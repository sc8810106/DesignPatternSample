package BehavioralPattern.CommandPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2019/2/24.
 */
public class OrderExecutor {
    private List<Order> orderList = new ArrayList<>();

    public void addOrder(Order order){
        orderList.add(order);
    }

    public void executeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
