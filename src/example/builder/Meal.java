package example.builder;

import java.util.ArrayList;
import java.util.List;

/*
套餐组合类
 */
public class Meal {
    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){
        System.out.println("套餐消费："+this.getCost()+"元，条目如下:");
        for (Item item : items) {
            System.out.print(item.name());
            System.out.print(", 包装 : "+item.packing().pack());
            System.out.println(", 价格 : "+item.price());
        }


    }
}
