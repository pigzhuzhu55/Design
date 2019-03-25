package example.memento;

/*
备忘录
这里存储一个字符串状态
 */
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
