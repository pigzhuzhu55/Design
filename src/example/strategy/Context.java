package example.strategy;
/*
策略模式
定义了一序列的算法，并将每个算法封装起来，使他们可以相互替换，让算法独立于使用它的用户而独立变化。
其实也就是面向接口编程
使用者Context
 */
public class Context {

    private Strategy straegy;
    public Context(Strategy straegy)
    {
        this.straegy = straegy;
    }

    /*
    以下是各种方法封装，按自己需要的设计
     */
    public void doSomeMethod(){
        this.straegy.operate();
    }

    public void doSomeMethodEx(Strategy straegy){
        straegy.operate();
    }

    public void doSomeMethod2(String op)
    {
        switch (op)
        {
            case "1":new AchieveClass1().operate();break;
            case "2":new AchieveClass2().operate();break;
            case "3":new AchieveClass3().operate();break;
        }
    }

    public void doSomeMethod2Ex(String op,String msg)
    {
        switch (op)
        {
            case "1":new AchieveClass1().operate2(msg);break;
            case "2":new AchieveClass2().operate2(msg);break;
            case "3":new AchieveClass3().operate2(msg);break;
        }
    }
}
