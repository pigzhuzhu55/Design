package example.bridge;

public class GreenRect extends Sharp {

    public GreenRect(Color color){
        this.color = color;
    }
    private Color color;

    @Override
    public void draw() {
        System.out.println("画"+this.color+"Rect");
    }

}
