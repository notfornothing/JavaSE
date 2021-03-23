package cn.leijiba.day18;

/**
 * @Author notfornothing
 * @Date 2021/3/23 14:38
 */
public class Student {
    public int age;
    public String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Student(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public Student() {
    }

    public void tell() {
        System.out.println("i have a secret");
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}