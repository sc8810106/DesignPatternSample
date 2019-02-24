package CreationalPattern.BuilderPattern;

/**
 * Created by Administrator on 2019/2/24.
 */
public class Sprite extends ColdDrink {
    @Override
    public String name() {
        return "Sprite";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
