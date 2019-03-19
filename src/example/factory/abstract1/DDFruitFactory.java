package example.factory.abstract1;

//多多水果工厂类：具体工厂
//多多水果工厂 负责生产红苹果和绿香蕉
public class DDFruitFactory implements FruitFactory {

    public Apple createApple() {
        return new RedApple();
    }

    public Banana createBanana() {
        return new GreenBanana();
    }

}
