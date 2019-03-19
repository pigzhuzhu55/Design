package example.component;

/*
ConcreteComponent
 */
public class Apple implements Fruit {
    @Override
    public void eat() {
        System.out.println("吃一个苹果");
    }
}
