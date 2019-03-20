package example.factory.simple;
/*
简单工厂模式
其实就是针对策略模式进行的改进
create()方法通常是静态的，又称静态工厂方法模式

它存在的目的很简单：定义一个用于创建对象的接口

 */
public class Main {

    public static void main(String[] args){
        Fruit fruit = FruitFactory.createFruit(1);
        fruit.eat();
    }
}