package example.adapter.compose;

/*
适配器
 */
public class Adapter implements Usb2_0{

    private Usb3_0 usb3_0;

    public Adapter(Usb3_0 usb3_0)
    {
        this.usb3_0= usb3_0;
    }

    @Override
    public void isUsb20() {
        usb3_0.isUsb30();
    }
}
