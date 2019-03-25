package example.visitor;

/*
Visitor

 */
public interface People {
    void visit(AndroidMobile apple);
    void visit(HuaWei huawei);
    void visit(ViVo vivo);
    void visit(XiaoMI xiaomi);
}
