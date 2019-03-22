package example.responsibility;

public class WaterInto  implements CookResponsibility{
    @Override
    public void doHander(Object obj,CookChain chain) {
        System.out.println("往锅里面放水..");
        chain.cooking(obj);
    }
}
