package example.single;
/*
懒汉模式5
静态内部类方式
优点：线程安全，延迟加载，效率高
原理：类的静态属性只会在第一次加载类的时候初始化。在这里，JVM帮我们保证了线程的安全性，在类进行初始化的时候，别的线程是无法进入的
 */
public class Singleton5 {
    private  Singleton5() {
    }
    /*
    静态内部类
     */
    private static  class  Singleton5Instance{
        private static final  Singleton5 INSTANCE = new Singleton5();
    }
    public static Singleton5 getInstance()
    {
        return Singleton5Instance.INSTANCE;
    }
}
