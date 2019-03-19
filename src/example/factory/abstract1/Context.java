package example.factory.abstract1;

/*
抽象工厂模式
抽象工厂模式是工厂方法模式的升级版本
提供一个接口，目标是创建一组相关或相互依赖的对象，而且无需指定他们的具体类。

抽象工厂模式提供多个具体工厂角色，分别对应于这两个具体产品角色，分别对应于这两个具体产品角色
每一个具体工厂类只负责创建抽象产品的某一个具体子类的实例

他与工厂方法模式的区别就在于，工厂方法模式针对的是一个产品等级结构；而抽象工厂模式则是针对的多个产品等级结构。
在编程中，通常一个产品结构，表现为一个接口或者抽象类，
也就是说，工厂方法模式提供的所有产品都是衍生自同一个接口或抽象类，而抽象工厂模式所提供的产品则是衍生自不同的接口或抽象类。

注意：本例FruitFactory使用的是接口，你可以改成抽象类，一样的道理
使用者Context
 */
public class Context {

    public void Main(){

        //实例化多多水果工厂
        FruitFactory factory =  new DDFruitFactory();
        //创建一个苹果
        Apple apple = factory.createApple();
        //吃苹果
        apple.eat();
        //创建一个香蕉
        Banana banana = factory.createBanana();
        //吃香蕉
        banana.eat();

        //同样下面可以实例化旺旺水果工厂
        FruitFactory factory2 =  new WWFruitFactory();
        //创建一个苹果
        Apple apple2 = factory2.createApple();
        //吃苹果
        apple2.eat();
        //创建一个香蕉
        Banana banana2 = factory2.createBanana();
        //吃香蕉
        banana2.eat();


        //从表面上看，你也不知道多多生产的是什么苹果（红？绿？），也不知道旺旺生产的是什么香蕉（黄？绿？）
    }
}
