package example.bridge;

public class GreenCircle extends Sharp {

    public GreenCircle(Color color){
        this.color = color;
    }
    private Color color;

    @Override
    public void draw() {
        System.out.println("画"+this.color+"Circle");
    }

}
