package example.adapter.interfaces;

public class Usb2_0Impl extends Adapter {
    public void isUsb20() {
        System.out.println("USB2.0口");
    }

    public void rate480(){
        System.out.println("速率480m/s");
    }
}
