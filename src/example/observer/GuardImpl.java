package example.observer;

import java.util.ArrayList;
import java.util.List;

/*
被观察者
物业管理者
 */
public class OwnerImpl implements Guard {
    private List<Owner> list;

    private String message;

    public OwnerImpl() {
        list = new ArrayList<Owner>();
    }

    @Override
    public void registerObserver(Owner o) {

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
            oserver.ask(message);
        }
    }

    public void setInfomation(String s) {
        this.message = s;
        System.out.println("物业通知： " + s);
        //消息更新，通知所有观察者
        notifyObserver();
    }
}
