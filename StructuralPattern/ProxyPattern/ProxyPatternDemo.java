package StructuralPattern.ProxyPattern;

/**
 * Created by Administrator on 2019/2/24.
 */
public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        image.display();
        System.out.println("");
        image.display();
    }
}
