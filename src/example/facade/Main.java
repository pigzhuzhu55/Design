package example.adapter.compose;


/*
通过类组合，内部对象
 */
public class Main {

    public static void main(String[] args){
        //2.0的接口
        Usb2_0 usb20= new Adapter(new Usb3_0Impl());
        usb20.isUsb20();
    }

}
