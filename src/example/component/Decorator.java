package example.component;

/*
Decorator
 */
public abstract class Decorator implements Fruit{
    protected  Fruit fruit;

    public Decorator(Fruit fruit)
    {
        this.fruit = fruit;
    }
    public void eat(){
         fruit.eat();
    }
}
