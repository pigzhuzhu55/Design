package example.state;


public class PayState implements State {

    private CoffeeMachine coffeeMachine;

    public PayState(CoffeeMachine coffeeMachine){
        this.coffeeMachine = coffeeMachine;
    }
    @Override
    public void pay() {
        System.out.println("你已支付，请去购买咖啡");
    }

    @Override
    public void refund() {
        System.out.println("退款成功，请查收");
        this.coffeeMachine.state = this.coffeeMachine.NO_PAY;
    }

    @Override
    public void buy() {
        System.out.println("购买成功，请取用");
        this.coffeeMachine.state = this.coffeeMachine.SOLD;
    }

    @Override
    public void getCoffee() {
        System.out.println("请先确认购买");
    }
}
