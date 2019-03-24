package example.observer;

public class OwnerImpl implements Owner {

    private String name;
    private String message;

    public OwnerImpl(String name) {
        this.name = name;
    }

    @Override
    public void notify(String message) {

        this.message = message;
        read();
    }

    private void read(){
        if(this.name!=this.message)
        {
            System.out.println(name + "心想： 不是我的快递" );
        }
        else {
            System.out.println(name + "回答： 我的我的，我下班就去取");
        }
    }
}
