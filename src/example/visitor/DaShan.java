package example.visitor;

/*
大山对这些手机的看法
 */
public class DaShan implements People {
    @Override
    public void visit(HuaWei huawei) {
        System.out.println("华为手机80分");
    }

    @Override
    public void visit(ViVo vivo) {
        System.out.println("vivo手机85分");

    }

    @Override
    public void visit(XiaoMI xiaomi) {

        System.out.println("小米手机75分");
    }

    @Override
    public void visit(AndroidMobile apple) {
        System.out.println("安卓手机80分");

    }
}
