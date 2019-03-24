package example.command;

/*
洗
 */
public class WashCommand implements  Command{
    @Override
    public void execute() {
        System.out.println("洗洗更干净");
    }
}
