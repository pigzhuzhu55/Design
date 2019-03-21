package example.proxy.dynamic;

/*
注射青霉素
 */
public class Penicillin implements Inject{

    @Override
    public boolean doIt(String illName) {
        if(illName=="感冒"||illName=="胃病") {
            System.out.println("医生：嗯，打个针就好了");
            return true;
        }
        System.out.println("医生：我这边治不了，你换个医院吧");
        return false;
    }
}
