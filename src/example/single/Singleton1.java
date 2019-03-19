package example.single;

/*
懒汉模式1 只有被调用的时候才会实例化
注意线程不安全
 */
public class Singleton1 {
    private static Singleton1 singleton;
    private  Singleton1(){}
    public static Singleton1 getInstance()
    {
        if(singleton==null)
        {
            singleton= new Singleton1();
        }
        return  singleton;
    }
}
