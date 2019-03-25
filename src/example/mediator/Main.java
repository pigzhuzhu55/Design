package example.mediator;

/*

 */
public class Main {
    public static void main(String[] args){

        //充当中介者的miss高老师
        Teacher teacher = new MissGao();

        //新同学李磊由老师引见给同学们
        Student std1 = new LiLei(teacher);
        //新同学韩梅梅由老师引见给同学们
        Student std2 = new HanMM(teacher);

        //新同学给大家问好，看具体实现，其实都是通过miss高老师的Introduce()方法去说出来
        std1.SayHello("请多关照");
        std2.SayHello("请多关照");
    }
}
