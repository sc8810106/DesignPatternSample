package BehavioralPattern.NullObjectPattern;

/**
 * Created by Administrator on 2019/2/24.
 */
public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

}
