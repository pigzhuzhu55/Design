package example.iterator;

import java.util.ArrayList;
import java.util.List;

/*
名字的仓储
 */
public class NameRepository implements Container{

    public List<String> names;
    public NameRepository(){
        names = new ArrayList<>();
    }

    public void add(String name){
        this.names.add(name);
    }

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            if(index < names.size()){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return names.get(index++);
            }
            return null;
        }
    }
}
