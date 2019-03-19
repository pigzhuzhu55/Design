package example.strategy;

/*
实现类2
 */
public class AchieveClass2 implements Strategy {
    @Override
    public void operate() {
        System.out.println("hello2");
    }
    @Override
    public void operate2(String msg) {
        System.out.println(msg);
    }
}
