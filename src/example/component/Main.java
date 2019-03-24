package example.component;

public class Main {

    public static void main(String[] args){

        //苹果
        Apple apple = new Apple();

        //创建一个绿色苹果
        GreenApple greenApple = new GreenApple(apple);

        //红色苹果里面居然包了一个绿色苹果，不科学啊
        RedApple redApple = new RedApple(greenApple);

        //吃苹果
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
