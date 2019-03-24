package example.bridge;

public class Circle extends Sharp {

    public Circle(Color color){
        this.color = color;
    }
    private Color color;

    @Override
    public void draw() {
        System.out.println("画"+this.color.getColor()+"圆圈");
    }

    @Override
    public String getColor() {
        return this.color.getColor();
    }
}
