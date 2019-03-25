package example.mediator;

/*
韩梅梅
 */
public class HanMM extends Student {


    public HanMM(Teacher teacher) {
        super(teacher);
        this.name = "韩梅梅";
    }

    public void SayHello(String msg){
        this.teacher.Introduce(msg,this);
    }
}
