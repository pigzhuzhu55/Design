package example.proxy.dynamic;

/*
药物治疗
 */
public interface Medicine {
    //吃药前检查下病情
    boolean eat(String illName);
}
