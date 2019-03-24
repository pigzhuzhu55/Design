package example.observer;


/*
观察者模式
代码还有并发问题
 */
public class Main {

    public static void main(String[] args){

        //定义门卫
        GuardImpl guard = new GuardImpl();

        //定义3个业主
        OwnerImpl owner1 = new OwnerImpl("小明");
        OwnerImpl owner2 = new OwnerImpl("小红");
        OwnerImpl owner3 = new OwnerImpl("小花");

        //业主先到门卫那边打个招呼，如果有快递到，群里面通知下
        guard.registerObserver(owner1);
        guard.registerObserver(owner2);
        guard.registerObserver(owner3);

        guard.setInfomation("小红");
        System.out.println("----------------------------------------------");

        //小红搬家了，退群了
        guard.removeObserver(owner2);

        guard.setInfomation("小花");
    }

}
