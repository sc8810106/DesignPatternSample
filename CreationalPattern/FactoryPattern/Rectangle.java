package CreationalPattern.FactoryPattern;

/**
 * Created by Administrator on 2019/2/24.
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
