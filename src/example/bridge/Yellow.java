package example.bridge;

public class Yellow implements Color {
    public String name = "黄色的";
    @Override
    public String getColor() {
        return name;
    }
}
