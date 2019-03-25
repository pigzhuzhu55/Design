package example.mediator;

/*
李磊
 */
public class LiLei extends Student {

    public LiLei(Teacher teacher) {
        super(teacher);
        this.name = "李磊";
    }

    public void SayHello(String msg){
        this.teacher.Introduce(msg,this);
    }
}
