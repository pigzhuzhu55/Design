package example.proxy;

/*
家长
 */
public class Doctor implements Medicine {

    private Medicine medicine;

    public Doctor(Medicine medicine)
    {
        this.medicine = medicine;
    }

    @Override
    public boolean check(String illName) {
        eatBefore();
        boolean canEat = this.medicine.check(illName);
        if(canEat)
        {
            eatAfter();
        }
        return  canEat;
    }

    private void eatBefore()
    {
        System.out.println("医生：好的，我帮你看下");
    }

    private void eatAfter()
    {
        System.out.println("医生：如果吃完药，病还没好转，记得再来");
    }
}
