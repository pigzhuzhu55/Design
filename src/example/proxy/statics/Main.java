package example.proxy.statics;

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        //小孩生病了
        child.setIll("Cold");
        //小孩要买999感冒灵
        Medicine medicine = new Medicine999();
        //医生来了，检查了下药
        Doctor doctor = new Doctor(medicine);
        //小孩问医生
        child.ask(doctor);
        System.out.println("-------");
        //小孩2
        Child child2 = new Child();
        //小孩生病了
        child2.setIll("headache");
        //小孩问医生
        child2.ask(doctor);

    }
}
