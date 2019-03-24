package example.state;


public class SoldState implements State {

    private CoffeeMachine coffeeMachine;

    public SoldState(CoffeeMachine coffeeMachine){
        this.coffeeMachine = coffeeMachine;
    }
    @Override
    public void pay() {
        System.out.println("咖啡已出，请先取用");
    }

    @Override
    public void refund() {
        System.out.println("咖啡已出，无法退款");
    }

    @Override
    public void buy() {
        System.out.println("咖啡已出，请先取用");
        this.coffeeMachine.state = this.coffeeMachine.PAY;
    }

    @Override
    public void getCoffee() {
        System.out.println("成功取得咖啡");
        this.coffeeMachine.state = this.coffeeMachine.SOLD_OUT;
    }
}
