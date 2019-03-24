package example.builder;

/*
榴莲披萨
 */
public class DurianPizza extends Pizza{
    @Override
    public String name() {
        return "榴莲披萨";
    }

    @Override
    public float price() {
        return 50.0f ;
    }
}
