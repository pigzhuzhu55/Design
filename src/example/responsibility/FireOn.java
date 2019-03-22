package example.responsibility;

public class FireOn implements CookResponsibility{
    @Override
    public void doHander(Object obj,CookChain chain) {
        System.out.println("起火煮饭了..");
        chain.cooking(obj);
    }
}
