package example.responsibility;

/*
煮饭的步骤接口
 */
public interface CookResponsibility {
    void doHander(Object obj,CookChain chain);
}
