package example.iterator;

/*
 */
public class Main {
    public static void main(String[] args){

        NameRepository nameRepository = new NameRepository();
        nameRepository.add("lili");
        nameRepository.add("xiaozhang");

        for(Iterator iter =nameRepository.getIterator();iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }

    }
}
