package example.bridge;

/*
画各种形状的颜色图像
 */
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(new Blue());
        Rect rect = new Rect(new Red());
        Rect rect1 = new Rect(new Blue());
        Circle circle1 = new Circle(new Yellow());

        circle.draw();
        rect.draw();
        rect1.draw();
        circle1.draw();
    }
}
