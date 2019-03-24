package example.bridge;

public class Red implements Color {
    public String name = "红色的";
    @Override
    public String getColor() {
        return name;
    }
}
