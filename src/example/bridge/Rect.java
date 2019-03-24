package example.bridge;

public class Rect extends Sharp {

    public Rect(Color color){
        this.color = color;
    }
    private Color color;

    @Override
    public void draw() {
        System.out.println("画"+this.color.getColor()+"长方形");
    }

    @Override
    public String getColor() {
        return this.color.getColor();
    }
}
