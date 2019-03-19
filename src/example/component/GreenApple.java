package example.component;

public class GreenApple extends Decorator {
    public GreenApple(Fruit fruit) {
        super(fruit);
    }

    public void eat()
    {
        System.out.println("今天吃什么");
        this.fruit.eat();
        System.out.println("再吃一个绿苹果");
    }
}
