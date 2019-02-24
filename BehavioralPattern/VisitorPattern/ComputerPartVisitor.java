package BehavioralPattern.VisitorPattern;

/**
 * Created by Administrator on 2019/2/24.
 */
public interface ComputerPartVisitor {
    void visit(Computer computer);

    void visit(Mouse mouse);

    void visit(Keyboard keyboard);

    void visit(Monitor monitor);
}
