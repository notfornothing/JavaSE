package cn.leijiba.day11;

import javax.swing.*;
import java.math.BigInteger;

/**
 * @Author notfornothing
 * @Date 2021/3/12 10:48
 */


public class Test1_Object extends Object {
    public static void main(String[] args) {
        Student s1 = new Student(18,"jacky");
        Student s2 = new Student(11,"lucy");
        System.out.println("s1 hashCode:"+s1.hashCode());
        System.out.println("s2 hashCode:"+s2.hashCode());
        System.out.println("s1 toString default(HEX):"+s1);
        System.out.println("s1 Decimal hashCode:"+Integer.parseInt(s1.hashCode()+"",10));
        System.out.println("==================");



        char[] data = {'a', 'b', 'c'};
        System.out.println(data.toString());
        String sss = new String(data);
        String sss2 = "abc";
        String sss3 = "abc";
        System.out.println(sss == sss2);
        System.out.println(sss2 == sss3);
        System.out.println(sss.equals(sss2));
        System.out.println("==================");
        String b1 = "a b c d e f g";
        System.out.println(b1.substring(1,4));//[1,4)
        String b2 = "  sdf dsaf sadf     ";
        System.out.println(b2.trim());
    }
}
class Student{

    public Student() {
    }

    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
