package cn.leijiba.day06;

/**
 * @Author notfornothing
 * @Date 2021/3/5 15:29
 */
public class Test2_Private {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name);
        s.study();
        s.name = "程序猿";
        s.sno = 666;
       // s.subject = "Java培优";
        System.out.println(s.name);
        System.out.println(s.sno);
       // System.out.println(s.subject);
        s.setSubject("JavaCGB");
        System.out.println(s.getSubject());
        s.study();


    }

}

/***
 * 封装:通过private关键字(权限修饰符)来修饰成员变量/成员方法
 * 被修饰的成员就实现了私有化,访问权限只能在本类中访问
 */
class Student {
    String name;
    int sno;
    private String subject;

    public void setSubject(String s) {
        subject = s;
    }

    public String getSubject() {
        return subject;
    }

    public void study() {
        System.out.println("正在学习JAVA");
        eat();
    }

    private void eat() {
        System.out.println("干饭人 干饭魂");
    }

}

