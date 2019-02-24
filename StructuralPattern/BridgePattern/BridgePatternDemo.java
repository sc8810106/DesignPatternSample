package StructuralPattern.BridgePattern;

/**
 * Created by Administrator on 2019/2/24.
 */
public class BridgePatternDemo {

    public static void main(String[] args) {
        Shape redCircle = new Circle(new RedCircle(), 100, 10, 10);
        Shape greenCircle = new Circle(new GreenCircle(), 100, 10, 10);
        redCircle.draw();
        greenCircle.draw();
    }
}
