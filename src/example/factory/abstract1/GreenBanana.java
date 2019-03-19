package example.factory.abstract1;

//青香蕉类：具体产品
public class GreenBanana implements Banana{
    @Override
    public void eat() {
        System.out.println("吃一个青香蕉");
    }
}
