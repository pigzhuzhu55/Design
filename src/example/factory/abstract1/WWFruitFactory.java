package example.factory.abstract1;

//旺旺水果工厂类：具体工厂
//旺旺水果工厂 负责生产绿苹果和黄香蕉
public class WWFruitFactory implements FruitFactory {

    public Apple createApple() {
        return new GreenApple();
    }

    public Banana createBanana() {
        return new YellowBanana();
    }

}
