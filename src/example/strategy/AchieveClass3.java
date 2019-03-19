package example.strategy;

/*
实现类3
 */
public class AchieveClass3 implements Strategy {
    @Override
    public void operate() {
        System.out.println("hello3");
    }
    @Override
    public void operate2(String msg) {
        System.out.println(msg);
    }
}
