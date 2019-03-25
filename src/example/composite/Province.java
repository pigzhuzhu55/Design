package example.composite;

import java.util.ArrayList;
import java.util.List;

public class Province extends Area {

    public Province(String name){
        super(name);
        cityList =new ArrayList<>();
    }

    private List<Area> cityList;

    @Override
    protected void add(Area area) {
        cityList.add(area);
    }

    @Override
    protected void remove(Area area) {
        cityList.remove(area);
    }

    @Override
    protected void display() {
        System.out.println("省:"+ this.name);
        for(Area area:cityList){
            area.display();
        }
    }
}
