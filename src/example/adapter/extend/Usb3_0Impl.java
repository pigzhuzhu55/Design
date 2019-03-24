package example.adapter.extend;

/*
Usb3.0的实现类
 */
public class UsbImpl implements Usb3_0{
    @Override
    public void isUsb30() {
        System.out.println("USB3.0口");
    }
}
