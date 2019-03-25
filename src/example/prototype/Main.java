package example.prototype;



/*
演示了浅拷贝
 */
public class Main {

    public static void main(String[] args){

        Brand brand1= new Brand("小米");
        TV tv1 = new TV(brand1,55);

        TV tv2 = (TV) tv1.clone();

        tv1.setSize(66);
        brand1.setName("海信");

      tv1.display();
      tv2.display();

      //发现两台电视都变成了海信品牌
      //可见，浅拷贝只是将 内部对象的地址保存
    }

}
