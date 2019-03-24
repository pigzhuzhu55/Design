package example.command;

import example.facade.Register;

import java.util.HashMap;
import java.util.Map;

public class Receiver {

    public Map<String,Command> commandMap;

    public Receiver (){
        commandMap = new HashMap<String,Command>();
    }

    public void register(String commonStr,Command cmd){
        commandMap.put(commonStr,cmd);
    }
    public void receive(String commonStr){
        Command cmd = commandMap.get(commonStr);
        if(cmd!=null){
            cmd.execute();
            return;
        }
        System.out.println("不支持该命令");
    }
}
