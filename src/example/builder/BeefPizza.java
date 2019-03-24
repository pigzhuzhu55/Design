package example.builder;

/*
牛肉披萨
 */
public class BeefPizza extends Pizza{
    @Override
    public String name() {
        return "牛肉披萨";
    }

    @Override
    public float price() {
        return 25.0f ;
    }
}
