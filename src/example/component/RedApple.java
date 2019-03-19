package example.component;

public class RedApple extends Decorator {
    public RedApple(Fruit fruit) {
        super(fruit);
    }

    public void eat()
    {
        this.fruit.eat();
        System.out.println("再吃一个红苹果");
    }
}
