package example.strategy;

/*
实现类1
 */
public class AchieveClass1 implements Strategy {
    @Override
    public void operate() {
        System.out.println("hello1");
    }
    @Override
    public void operate2(String msg) {
        System.out.println(msg);
    }
}
