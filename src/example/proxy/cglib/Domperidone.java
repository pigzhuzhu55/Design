package example.proxy.cglib;


/*
吗丁啉
 */
public class Domperidone implements Medicine {

    @Override
    public boolean eat(String illName) {
        //如果不是胃痛引起的病
        if(illName!="胃痛")
        {
            System.out.println("医生：你不是胃痛，不能吃吗丁啉");
            return false;
        }
        System.out.println("医生：你这是胃痛、胃胀，请服用吗丁啉吧");
        return true;
    }
}
