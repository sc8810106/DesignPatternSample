package CreationalPattern.BuilderPattern;

/**
 * Created by Administrator on 2019/2/24.
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
