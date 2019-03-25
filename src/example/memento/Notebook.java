package example.memento;

import java.util.ArrayList;
import java.util.List;

/*
老人家把东西做过的东西都记在小本本
 */
public class Notebook {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
