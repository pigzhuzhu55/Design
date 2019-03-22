package example.responsibility;

import java.util.ArrayList;
import java.util.List;

public class CookChain {
    private List<CookResponsibility> responsibilities;

    private int index=0;

    public CookChain(){
        this.responsibilities = new ArrayList<>();
    }

    public void cooking(Object obj)
    {
        if(this.index<this.responsibilities.size()){
            this.responsibilities.get(index++).doHander(obj,this);
        }
    }

    /*
    添加煮饭步骤
     */
    public void addCookStep(CookResponsibility cr)
    {
        this.responsibilities.add(cr);
    }
}
