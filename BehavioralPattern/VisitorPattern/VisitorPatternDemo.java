package BehavioralPattern.VisitorPattern;

/**
 * Created by Administrator on 2019/2/24.
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartVisitorDisplay());
    }
}
