package CreationalPattern.PrototypePattern;

/**
 * Created by Administrator on 2019/2/24.
 */
public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
