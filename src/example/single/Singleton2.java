package example.single;

/*
懒汉模式2
线程安全，但不推荐
实例化后就不应该再同步了，效率低
 */
public class Singleton2 {
    private static Singleton2 singleton;
    private  Singleton2(){}
    public static synchronized Singleton2 getInstance()
    {
        if(singleton==null)
        {
            singleton= new Singleton2();
        }
        return  singleton;
    }
}
