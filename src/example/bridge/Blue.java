package example.bridge;

public class Blue implements Color {
    public String name = "蓝色的";

    @Override
    public String getColor() {
        return name;
    }
}
