package example.factory.abstract1;

public class Main {

    public static void main(String[] args){

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
