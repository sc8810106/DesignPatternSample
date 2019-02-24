package CreationalPattern.AbstractFactoryPattern;

/**
 * Created by Administrator on 2019/2/24.
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String factory) {
        if (factory.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if (factory.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }
}
