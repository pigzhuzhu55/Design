package example.observer;

import java.util.ArrayList;
import java.util.List;

/*
被观察者 门卫
 */
public class GuardImpl implements Guard {
    private List<Owner> list;

    private String message;

    public GuardImpl() {
        list = new ArrayList<Owner>();
    }

    @Override
    public void registerObserver(Owner o) {
        list.add(o);
    }

    @Override
    public void removeObserver(Owner o) {
        if(!list.isEmpty())
            list.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(int i = 0; i < list.size(); i++) {
            Owner oserver = list.get(i);
            oserver.notify(message);
        }
    }

    public void setInfomation(String s) {
        this.message = s;
        System.out.println("门卫新消息！门卫新消息！" + s+"，您的快递到了");
        //消息更新，通知所有观察者
        notifyObserver();
    }
}
