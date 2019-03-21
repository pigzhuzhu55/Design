package example.component;

public class Main {

    public static void main(String[] args){

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
