package example.proxy.dynamic;


public class Main {
    public static void main(String[] args) {

        Child child = new Child();
        //小孩生病了
        child.setIll("胃痛");

        //发现999感冒灵
        Medicine medicine= new Medicine999();
        //医院代理卖这个药
        Medicine medicine999 = (Medicine)Hospital.proxy(medicine);
        //小孩去医院看医生，并开药
        child.ask(medicine999);

        System.out.println("-------");
        //发现吗丁啉
        Medicine medicine1 = new Domperidone();
        //医院代理卖这个药
        Medicine domperidone = (Medicine)Hospital.proxy(medicine1);
        //小孩去医院看医生，并开药
        child.ask(domperidone);

        System.out.println("-------");

        //发现青霉素注射剂
        Inject inject = new Penicillin();
        //放到医院才能打
        Inject inject1 = (Inject)Hospital.proxy(inject);
        inject1.doIt("感冒");


    }
}
