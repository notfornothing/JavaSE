package cn.leijiba.day14;

import java.io.File;
import java.io.Serializable;

/**
 * @Author notfornothing
 * @Date 2021/3/17 9:37
 */
public class Student implements Serializable {
    private  String name;
    private Integer age;
    private static final Long serialVersionUID = 12312312313123l;
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Student() {
    }

    public Student(String name, Integer age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    private String address;
}
