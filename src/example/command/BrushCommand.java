package example.command;

public class BrushCommand implements Command {
    @Override
    public void execute() {
        System.out.println("刷刷更健康");
    }
}
