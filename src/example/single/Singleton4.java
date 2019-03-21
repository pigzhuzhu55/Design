package example.single;
/*
懒汉模式4
双重检查 在同步关键字里面再加一个检查
volatile 关键字很关键，如果没有这个关键字，一样不行，主要保证并发线程访问的时候，互相可见性
推荐使用
 */
public class Singleton4 {

    private static volatile Singleton4 singleton;

    private Singleton4() {
    }

    public static Singleton4 getInstance() {
        if (singleton == null) {
            synchronized (Singleton4.class) {
                if (singleton == null) {
                    singleton = new Singleton4();
                }
            }
        }
        return singleton;
    }
    public void myMethod1(){

    }
}
