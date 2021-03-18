package cn.leijiba.day15;

import java.util.Objects;

/**
 * @Author notfornothing
 * @Date 2021/3/18 15:20
 */
public class Student {
    private String name;
    private int age;
    private String addr;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(addr, student.addr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, addr);
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", addr='" + addr + '\'' +
                '}';
    }

    public Student(String name, int age, String addr) {
        this.name = name;
        this.age = age;
        this.addr = addr;
        System.out.println("I am all constructor");
    }

    public Student() {
        System.out.println("constructor without param");
    }
}
