package example.proxy.cglib;



public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        //小孩生病了
        child.setIll("胃痛");

        Medicine999 medicine999 =new Medicine999();
        HospitalCglib hospital = new HospitalCglib();
        Medicine medicine = (Medicine)hospital.getInstanceOfClass(medicine999);
        child.ask(medicine);

        System.out.println("-------");
        //发现青霉素注射剂
        Inject inject = new Penicillin();
        //放到医院才能打
        Inject inject1 = (Inject)hospital.getInstanceOfInterface(inject);
        inject1.doIt("感冒");

        System.out.println("-------");



    }
}
