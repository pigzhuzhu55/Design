package example.component;


import example.factory.method.FruitFactory;
import example.factory.method.IFruitFactory;

/*
装饰者模式
不改变具体类代码，动态地叠加增强行为功能
装饰者可以在被装饰者的行为前面与/或后面加上自己的行为，甚至将被装饰者的行为整个取代掉，而达到特定的目的。

使用者Context
 */
public class Context {

    public static void Main(String[] args){

        Apple apple = new Apple();

        GreenApple greenApple = new GreenApple(apple);
        RedApple redApple = new RedApple(greenApple);

        redApple.eat();
    }

    /*
    输出：
        今天吃什么
        吃一个苹果
        再吃一个绿苹果
        再吃一个红苹果
     */
}
