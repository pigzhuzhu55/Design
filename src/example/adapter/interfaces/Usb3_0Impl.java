package example.adapter.interfaces;

public class Usb3_0Impl extends Adapter {
    public void isUsb20() {
        System.out.println("USB2.0口");
    }

    public void rate480Mbps(){
        System.out.println("速率480m/s");
    }

    public void isUsb30(){
        System.out.println("USB3.0口");
    }
    public void rate5Gbps(){
        System.out.println("速率5g/s");
    }
}
