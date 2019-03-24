package example.adapter.extend;

/*
通过类继承
 */
public class Main {

    public static void main(String[] args){
        //2.0的接口
        Usb2_0 usb20= new Adapter();
        usb20.isUsb20();
    }

}
