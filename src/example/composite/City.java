package example.composite;

import java.util.ArrayList;
import java.util.List;

public class City extends Area {

    public City(String name){
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
        System.out.println("\t市:"+ this.name);
        System.out.print("\t\t县:");
        for(Area area:cityList){
            area.display();
        }
        System.out.println();
    }
}
