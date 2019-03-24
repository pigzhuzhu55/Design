package example.template;

/*
模板方法模式
 */
public class Main {

    public static void main(String[] args){

        BallSport b1 = new Basketball();
        b1.play();
        BallSport b2 = new Football();
        b2.play();
    }
}
