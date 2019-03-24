package example.adapter.interfaces;

/*
通过抽象类
 */
public class Main {
    public static void main(String[] args){
        //2.0的接口
        Usb2_0 usb20= new Usb3_0Impl();
        usb20.isUsb20();
        usb20.rate480Mbps();
        ((Usb3_0Impl) usb20).isUsb30();
        ((Usb3_0Impl) usb20).rate5Gbps();
    }
}
