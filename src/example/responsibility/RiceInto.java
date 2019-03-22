package example.responsibility;

public class RiceInto implements CookResponsibility{
    @Override
    public void doHander(Object obj,CookChain chain) {
        System.out.println("往锅里面放米..");
        chain.cooking(obj);
    }
}
