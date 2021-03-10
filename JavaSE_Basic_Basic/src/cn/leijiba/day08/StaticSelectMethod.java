package cn.leijiba.day08;

import java.sql.SQLOutput;

/**
 * @Author notfornothing
 * @Date 2021/3/9 11:14
 */
//非静态能调用静态,因为要非静态是后创建的
//静态不能调用非静态,理由同上.
public class StaticSelectMethod {
    public static void main(String[] args) {
    Teacher.eat();
    }
}
class Teacher{
    String name;

    public void teach() {
        System.out.println(age);
        eat();
        System.out.println("teaching!!!!");
    }

    static int age;

    public static void eat() {
        System.out.println("eating!!!!!!!!!");
    }
}
