package example.responsibility;

/*
模拟煮饭的流程

注意这个例子存在线程安全的问题，我只是用来模拟设计模式
 */
public class Main {
    public static void main(String[] args) {

        CookChain cookChain = new CookChain();
        cookChain.addCookStep(new WaterInto());
        cookChain.addCookStep(new RiceInto());
        cookChain.addCookStep(new FireOn());

        cookChain.cooking(new Object());
    }
}
