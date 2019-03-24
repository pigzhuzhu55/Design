package example.observer;

/*
物业,
抽象被观察者接口
声明了添加、删除、通知观察者方法
 */
public interface Owner1 {
    public void registerObserver(Owner guard);
    public void removeObserver(Owner guard);
    public void notifyObserver();
}
