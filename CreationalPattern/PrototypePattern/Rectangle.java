package CreationalPattern.PrototypePattern;

/**
 * Created by Administrator on 2019/2/24.
 */
public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
