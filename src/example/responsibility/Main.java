package example.responsibility;

/*
模拟煮饭的流程

注意这个例子存在线程安全的问题，我只是用来模拟设计模式
 */
public class Main {
    public static void main(String[] args) {

        //定义一套煮饭流程
        CookChain cookChain = new CookChain();
        //增加步骤放水
        cookChain.addCookStep(new WaterInto());
        //增加步骤放米
        cookChain.addCookStep(new RiceInto());
        //增加步骤起火
        cookChain.addCookStep(new FireOn());
        //开煮咯
        cookChain.cooking(new Object());
    }
}
