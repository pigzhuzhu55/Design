package example.state;

/*
模拟咖啡机售卖咖啡的流程
 */
public class Main {

    public static void main(String[] args){
        //先定义一个咖啡机
        CoffeeMachine coffeeMachine = new CoffeeMachine(10);
        //我要买
        coffeeMachine.buy();
        //我要支付
        coffeeMachine.pay();
        //我要买
        coffeeMachine.buy();
        //拿咖啡
        coffeeMachine.getCoffee();
        //退货
        coffeeMachine.refund();
    }
}
