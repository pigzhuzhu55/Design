package example.template;

/*
球类运动
 */
public abstract class BallSport {
    protected abstract void initialize();
    protected abstract void start();
    protected abstract void end();

    public final void play(){
        initialize();
        start();
        end();
    }
}
