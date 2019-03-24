package example.state;


public class SoldOutState implements State {

    private CoffeeMachine coffeeMachine;

    public SoldOutState(CoffeeMachine coffeeMachine){
        this.coffeeMachine = coffeeMachine;
    }
    @Override
    public void pay() {
        System.out.println("咖啡已被取用，请先完成本次交易");
    }

    @Override
    public void refund() {
        System.out.println("咖啡已被取用，请先完成本次交易");
    }

    @Override
    public void buy() {
        System.out.println("咖啡已被取用，请先完成本次交易");
    }

    @Override
    public void getCoffee() {
        System.out.println("咖啡已被取用，完成本次交易");
        this.coffeeMachine.state = this.coffeeMachine.NO_PAY;
    }
}
