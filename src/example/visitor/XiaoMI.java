package example.visitor;

public class XiaoMI implements Mobile{
    @Override
    public void accept(People p) {
        p.visit(this);
    }
}
