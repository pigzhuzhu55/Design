package example.proxy.dynamic;


public class Main {
    public static void main(String[] args) {

        Child child = new Child();
        //小孩生病了
        child.setIll("胃痛");

        //发现999感冒灵
        Medicine999 medicine999= new Medicine999();
        //医院代理卖这个药
        Medicine medicine1 = (Medicine)Hospital.proxy(medicine999);
        //小孩去医院看医生，并开药
        child.ask(medicine1);

        System.out.println("-------");
        //发现吗丁啉
        Domperidone domperidone = new Domperidone();
        //医院代理卖这个药
        Medicine medicine12 = (Medicine)Hospital.proxy(domperidone);
        //小孩去医院看医生，并开药
        child.ask(medicine12);

        System.out.println("-------");

        //发现青霉素注射剂
        Inject inject = new Penicillin();
        //放到医院才能打
        Inject inject1 = (Inject)Hospital.proxy(inject);
        inject1.doIt("感冒");


    }
}
