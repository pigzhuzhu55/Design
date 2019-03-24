package example.state;


public class NoPayState implements State {

    private CoffeeMachine coffeeMachine;

    public NoPayState(CoffeeMachine coffeeMachine){
        this.coffeeMachine = coffeeMachine;
    }
    @Override
    public void pay() {
        System.out.println("支付成功，请去确认购买咖啡");
        this.coffeeMachine.state = this.coffeeMachine.PAY;
    }

    @Override
    public void refund() {
        System.out.println("你还没支付，请不要乱按");
    }

    @Override
    public void buy() {
        System.out.println("你还没支付，请不要乱按");
    }

    @Override
    public void getCoffee() {
        System.out.println("你还没支付，请不要乱按");
    }
}
