package example.prototype;

public class Brand implements Cloneable{
    private String name;

    public Brand(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 克隆该实例
     */
    public Object deepclone(){
        Brand brand = null;
        try {
            brand = (Brand) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return brand;
    }
}
