package example.builder;

/*
披萨用的是盒包装
 */
public abstract class Pizza implements Item{

    @Override
    public Packing packing() {
        return new BoxPacked();
    }

    @Override
    public abstract  float price();
}
