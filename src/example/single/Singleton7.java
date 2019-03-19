package example.single;

/*
饿汉模式
静态私有成员，类加载的时候就已初始化
优点：线程安全
缺点：第一次加载类较慢
 */
public class Singleton7 {
    private Singleton7(){
    }

    private static Singleton7 inst = new Singleton7();

    public static Singleton7 getInstance()
    {
        return inst;
    }
}

