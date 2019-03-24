package example.command;

public class Main {
    public static void main(String[] args) {

        //创建命令接受方
        Receiver receiver = new Receiver();

        /*
        注册3个命令
         */
        receiver.register("1",new WashCommand());
        receiver.register("2",new BrushCommand());
        receiver.register("3",new WashCommand());

        /*
        执行命令
         */
        receiver.receive("1");
        receiver.receive("5");
    }
}
