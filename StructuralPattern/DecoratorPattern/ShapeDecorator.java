package StructuralPattern.DecoratorPattern;

/**
 * Created by Administrator on 2019/2/24.
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }


}
