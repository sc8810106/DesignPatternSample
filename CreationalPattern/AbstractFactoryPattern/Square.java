package CreationalPattern.AbstractFactoryPattern;

/**
 * Created by Administrator on 2019/2/24.
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
