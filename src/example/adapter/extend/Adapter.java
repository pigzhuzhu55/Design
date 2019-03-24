package example.adapter.extend;

/*
适配器
通过继承USB3.0的实现类，再去实现2.0的接口
这个类对外提供了2.0的接口且支持3.0的功能，提供给外部访问，其实内部功能已经是3.0
 */
public class Adapter extends Usb3_0Impl implements Usb2_0{
    @Override
    public void isUsb20() {
        isUsb30();
    }
}
