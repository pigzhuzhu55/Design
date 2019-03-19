package example.factory.abstract1;

/*
抽象水果工厂
负责所有的水果生产,每一个方法对应一种水果
 */
interface class AbstractFruitFactory {
    public abstract Apple createApple(); //生产苹果
    public abstract Banana createBanana();//生产香蕉
}
