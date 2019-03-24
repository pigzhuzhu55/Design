package example.template;

/*
篮球
 */
public class Basketball extends BallSport {
    @Override
    protected void initialize() {
        System.out.println("篮球运动员进场");
    }

    @Override
    protected void start() {
        System.out.println("篮球比赛开始");
    }

    @Override
    protected void end() {
        System.out.println("篮球比赛结束");
    }
}
