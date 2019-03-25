package example.visitor;

import java.util.ArrayList;
import java.util.List;

public class AndroidMobile implements Mobile{

    List<Mobile> mobiles ;

    public AndroidMobile(){
        mobiles = new ArrayList<>();
        mobiles.add(new HuaWei());
        mobiles.add(new XiaoMI());
        mobiles.add(new ViVo());
    }

    @Override
    public void accept(People p) {
        for(Mobile mobile :mobiles){
            mobile.accept(p);
        }
        p.visit(this);
    }
}