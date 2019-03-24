package example.builder;

/*
冷饮用的是瓶装
 */
public abstract class ColdDrink implements Item{
    @Override
    public Packing packing() {
        return new Bottled();
    }

    @Override
    public abstract  float price();
}
