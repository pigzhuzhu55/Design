package example.factory.abstract1;

//绿苹果类：具体产品
public class GreenApple implements Apple{
    @Override
    public void eat() {
        System.out.println("吃一个绿苹果");
    }
}
