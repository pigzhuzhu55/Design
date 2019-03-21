package example.factory.simple;

public class Main {

    public static void main(String[] args){
        Fruit fruit = FruitFactory.createFruit(1);
        fruit.eat();
    }
}
