package example.mediator;

/*
高小姐老师
中介角色，介绍新同学
 */
public class MissGao extends Teacher {
    @Override
    public void Introduce(String msg,Student student) {
        System.out.println(msg+",这位是 "+student.name);
    }
}
