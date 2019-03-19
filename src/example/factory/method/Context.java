package example.factory.method;


/*
工厂方法模式
去掉了简单工厂模式中工厂方法create的静态属性，使得它可以被子类继承,进而决定实例化哪一个类
优点：可以一定程度上解耦，消费者和产品实现类隔离开

使用者Context
 */
public class Context {

    public static void Main(String[] args){
        //实例化一个水果的工厂
        IFruitFactory factory = new FruitFactory();
        //生产一个水果
        Fruit fruit = factory.createFruit(1);
        //吃水果
        fruit.eat();
    }
}
