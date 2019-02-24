package BehavioralPattern.CommandPattern;

/**
 * Created by Administrator on 2019/2/24.
 */
public class Stock {

    private String name = "ABC";

    public void buy(){
        System.out.println("Stock [ Name: "+name +" ] bought");
    }
    public void sell(){
        System.out.println("Stock [ Name: "+name +" ] sold");
    }
}
