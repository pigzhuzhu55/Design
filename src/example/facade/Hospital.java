package example.facade;

/*
门面类
 */
public class Hospital {

    /*
    看病
     */
    public  void askDoctor()
    {
        Register register = new Register();
        register.doit();
        Check check = new Check();
        check.doit();
        TakeMedicine takeMedicine = new TakeMedicine();
        takeMedicine.doit();
    }
}
