package example.visitor;

public class ViVo implements Mobile{
    @Override
    public void accept(People p) {
        p.visit(this);
    }
}
