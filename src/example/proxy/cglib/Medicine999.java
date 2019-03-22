package example.proxy.cglib;


/*
999感冒灵
 */
public class Medicine999 implements Medicine {

    @Override
    public boolean eat(String illName) {
        //如果不是感冒引起的病
        if(illName!="感冒")
        {
            System.out.println("医生：你没感冒，不能吃999感冒灵");
            return false;
        }
        System.out.println("医生：嗯，感冒引起的发烧39°了，999感冒灵可以吃");
        return true;
    }
}
