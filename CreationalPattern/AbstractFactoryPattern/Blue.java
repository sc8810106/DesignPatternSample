package CreationalPattern.AbstractFactoryPattern;

/**
 * Created by Administrator on 2019/2/24.
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
