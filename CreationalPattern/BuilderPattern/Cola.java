package CreationalPattern.BuilderPattern;

/**
 * Created by Administrator on 2019/2/24.
 */
public class Cola extends ColdDrink {
    @Override
    public String name() {
        return "Cola";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
