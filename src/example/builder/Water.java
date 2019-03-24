package example.builder;

/*
矿泉水
 */
public class Water extends ColdDrink{
    @Override
    public String name() {
        return "矿泉水";
    }

    @Override
    public float price() {
        return 3.0f ;
    }
}
