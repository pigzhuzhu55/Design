package example.single;

/*
懒汉模式3
把同步关键字放在方法里面去判断，那么就做不到单例模式了
 */
public class Singleton3 {
    private static Singleton3 singleton;
    private  Singleton3(){}
    public static  Singleton3 getInstance()
    {
        if(singleton==null)
        {
            synchronized (Singleton3.class) {
                singleton = new Singleton3();
            }
        }
        return  singleton;
    }
    public void myMethod1(){

    }
}
