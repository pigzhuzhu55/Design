package example.memento;

/*
备忘录
每个人老了都用的到
 */
public class Main {
    public static void main(String[] args){
        //声明一个老人家
        Older man = new Older();

        //拿出小本本
        Notebook notebook= new Notebook();

        man.setState("六点起来跑步");
        man.setState("八点半吃饭");
        //记起来
        notebook.add(man.saveStateToMemento());
        man.setState("然后送小孩去上学");
        notebook.add(man.saveStateToMemento());
        man.setState("送完小孩就回家");

        System.out.println("我现在在干嘛: " + man.getState());
        man.getStateFromMemento(notebook.get(0));
        System.out.println("我前面在干嘛: " + man.getState());
        man.getStateFromMemento(notebook.get(1));
        System.out.println("我干嘛后又干嘛: " + man.getState());

    }
}
