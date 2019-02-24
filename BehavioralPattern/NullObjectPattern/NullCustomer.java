package BehavioralPattern.NullObjectPattern;

/**
 * Created by Administrator on 2019/2/24.
 */
public class NullCustomer extends AbstractCustomer {

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }

}
