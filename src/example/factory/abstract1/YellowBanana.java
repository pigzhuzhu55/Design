package example.factory.abstract1;

//黄香蕉类：具体产品
public class YellowBanana implements Banana{
    @Override
    public void eat() {
        System.out.println("吃一个黄香蕉");
    }
}
