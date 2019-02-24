package BehavioralPattern.VisitorPattern;

/**
 * Created by Administrator on 2019/2/24.
 */
public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
