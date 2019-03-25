package example.visitor;

/*
手机
每个人买手机的需求点不一样
 */
public interface Mobile {
    void accept(People p);
}
