package example.state;

/*
模拟咖啡机售卖咖啡的流程
 */
public class Main {

    public static void main(String[] args){
        CoffeeMachine coffeeMachine = new CoffeeMachine(10);
        coffeeMachine.buy();
        coffeeMachine.pay();
        coffeeMachine.buy();
        coffeeMachine.getCoffee();
        coffeeMachine.refund();
    }
}
