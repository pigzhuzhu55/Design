package example.factory.method;


public class FruitFactory implements IFruitFactory{
    @Override
    public Fruit createFruit(int type) {
        switch (type)
        {
            case 1:return new Apple();
            case 2:return new Banana();
            default: return new Orange();
        }
    }
}
