package example.command;

public class WipeCommand implements Command {
    @Override
    public void execute() {
        System.out.println("擦擦更洁白");
    }
}
