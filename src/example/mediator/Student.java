package example.mediator;

/*
老师作为中介，介绍新同学
 */
public abstract class Student {
    protected Teacher teacher;
    public String name= "";
    public Student(Teacher teacher){
        this.teacher =teacher;
    }

    abstract void SayHello(String msg);
}
