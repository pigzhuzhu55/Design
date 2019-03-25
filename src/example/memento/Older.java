package example.memento;

/*
老人家
管理备忘录
 */
public class Older {
    private String state;

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }

    /*
    把状态保存到备忘录里面
     */
    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    /*
    从备忘录里面获取一个状态
     */
    public void getStateFromMemento(Memento Memento){
        state = Memento.getState();
    }
}
