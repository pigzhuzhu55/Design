package example.composite;


public class County extends Area {

    public County(String name){
        super(name);
    }


    @Override
    protected void add(Area area) {

    }

    @Override
    protected void remove(Area area) {

    }

    @Override
    protected void display() {
        System.out.print(this.name+" ");
    }
}
