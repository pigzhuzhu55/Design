package example.visitor;

public class HuaWei implements Mobile{
    @Override
    public void accept(People p) {
        p.visit(this);
    }
}
