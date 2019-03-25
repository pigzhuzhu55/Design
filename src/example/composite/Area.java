package example.composite;

public abstract class Area {

    public Area(String name){
        super();
        this.name= name;
    }

    public String name;
    protected  abstract void add(Area area);
    protected  abstract void remove(Area area);
    protected  abstract void display();

}
