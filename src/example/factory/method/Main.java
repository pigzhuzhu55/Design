package example.factory.method;

public class Main {

    public static void main(String[] args){
        //实例化一个水果的工厂
        IFruitFactory factory = new FruitFactory();
        //生产一个水果
        Fruit fruit = factory.createFruit(1);
        //吃水果
        fruit.eat();
    }
}
