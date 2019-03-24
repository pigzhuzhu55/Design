package example.observer;

/*
门卫【很多旧小区，快递都是放在门卫那】,
抽象被观察者接口
声明了添加、删除、通知观察者方法
 */
public interface Guard {
    public void registerObserver(Owner guard);
    public void removeObserver(Owner guard);
    public void notifyObserver();
}
