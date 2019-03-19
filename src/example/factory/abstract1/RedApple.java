package example.factory.abstract1;

//红苹果类：具体产品
public class RedApple implements Apple{
    @Override
    public void eat() {
        System.out.println("吃一个红苹果");
    }
}
