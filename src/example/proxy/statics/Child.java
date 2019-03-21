package example.proxy.statics;


public class Child {

    private String illName;
    public void setIll(String illName)
    {
        this.illName=illName;
    }

    public void ask(Medicine medicine)
    {
        System.out.println("小孩：医生，我好像感冒了，这个药能不能吃");

        boolean canEat = medicine.check(illName);

        if(canEat)
        {
            System.out.println("小孩：谢谢，那我开吃了");
        }
        else {
            System.out.println("小孩：哦，那我不吃它");
        }
    }
}
