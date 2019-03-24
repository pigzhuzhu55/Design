package example.builder;

/*
水果披萨
 */
public class FruitsPizza extends Pizza{
    @Override
    public String name() {
        return "水果披萨";
    }

    @Override
    public float price() {
        return 28.5f ;
    }
}
