package example.visitor;


/*
模拟小明、大山对安卓手机的评分
 */
public class Main {
    public static void main(String[] args){
        Mobile mobile = new AndroidMobile();
        mobile.accept(new XiaoMing());
        mobile.accept(new DaShan());
    }
}
