package example.prototype;

/*
电视
 */
public class TV  implements Cloneable{
    private int size;
    private Brand brand;
    public TV(Brand brand,int size){
        this.brand=brand;
        this.size= size;
    }
    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size=size;
    }

    /**
     * 克隆该实例
     */
    public Object clone(){
        TV tv = null;
        try {
            tv = (TV) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return tv;
    }

    public void display(){
        System.out.println(this.brand.getName()+":"+this.getSize());
    }

}
