package cn.leijiba.day15;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author notfornothing
 * @Date 2021/3/18 15:29
 */
public class Test3_HashSet2 {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        Student s1 = new Student("1",1 ,"111");
        Student s3 = new Student("123klasdfjl", 222, "asd");
        Student s2 = new Student("1",1 ,"1");
        Student s4 = new Student("123klasdfjl", 222, "asd");
        Student s5 = new Student("123klasdfjl", 222, "asd");
        Student s6 = new Student("123klasdfjl", 222, "asd");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
