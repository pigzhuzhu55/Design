package example.factory.simple;

/*
水果加工厂，用于出售各种水果制品
 */
public class FruitFactory {
    /*
    创建一个喜爱的水果
     */
    public static Fruit createFruit(int type)
    {
        switch ( type)
        {
            case 1:return new Apple();
            case 2:return new Banana();
            default: return new Orange();
        }
    }
}
