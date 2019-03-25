package example.visitor;

/*
小明对这些手机的看法
 */
public class XiaoMing implements People {
    @Override
    public void visit(HuaWei huawei) {
        System.out.println("华为手机90分");
    }

    @Override
    public void visit(ViVo vivo) {
        System.out.println("vivo手机95分");

    }

    @Override
    public void visit(XiaoMI xiaomi) {

        System.out.println("小米手机95分");
    }

    @Override
    public void visit(AndroidMobile apple) {
        System.out.println("安卓手机92分");

    }
}
