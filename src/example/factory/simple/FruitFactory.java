package example.factory;

/*
水果加工厂，用于出售各种水果制品
 */
public class FruitFactory {
    /*
    获得一个喜爱的水果
     */
    public Fruit getLoveFruit(String peopleName)
    {
        switch ( peopleName)
        {
            case "xiaoming":return new Apple();
            case "xiaowang":return new Banana();
            default: return new Orange();
        }
    }
}
