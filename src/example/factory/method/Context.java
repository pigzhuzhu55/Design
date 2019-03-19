package example.factory.simple;
/*
简单工厂模式
其实就是针对策略模式进行的改进
又称静态工厂方法模式

它存在的目的很简单：定义一个用于创建对象的接口

使用者Context
 */
public class Context {

    public void Main(){
        FruitFactory factory = new FruitFactory();
        Fruit fruit = factory.getLoveFruit("lilei");
        fruit.eat();
    }
}
