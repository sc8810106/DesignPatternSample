package StructuralPattern.DecoratorPattern;

/**
 * Created by Administrator on 2019/2/24.
 */
public class RedBorderDecorator extends ShapeDecorator{
    public RedBorderDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder();
    }


    private void setRedBorder(){
        System.out.println("Border Color: Red");
    }
}
