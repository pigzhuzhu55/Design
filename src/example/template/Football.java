package example.template;

/*
足球
 */
public class Football extends BallSport {
    @Override
    protected void initialize() {
        System.out.println("足球运动员进场");
    }

    @Override
    protected void start() {
        System.out.println("足球比赛开始");
    }

    @Override
    protected void end() {
        System.out.println("足球比赛结束");
    }
}
