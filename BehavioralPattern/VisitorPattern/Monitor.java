package BehavioralPattern.VisitorPattern;

/**
 * Created by Administrator on 2019/2/24.
 */
public class Monitor implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
