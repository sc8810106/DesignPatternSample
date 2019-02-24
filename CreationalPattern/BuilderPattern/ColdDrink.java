package CreationalPattern.BuilderPattern;

/**
 * Created by Administrator on 2019/2/24.
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing(){
        return new Bottle();
    }

    @Override
    public abstract float price();
}
