package cn.leijiba.day14;

import java.io.*;

/**
 * @Author notfornothing
 * @Date 2021/3/17 9:49
 */
public class Test1_Seri {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        method1();
        method2();
    }

    private static void method2() throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(
                new FileInputStream("./test.txt")
        );
        Object o = objectInputStream.readObject();
        System.out.println(o);
    }

    private static void method1() throws IOException {
        ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream("./test.txt")
        );
        Student student = new Student("lucy", 18, "asdf");
        Student student2 = new Student("lucyqwe", 128, "asqwqeqwedf");
        Student student3 = new Student("lucyqwe", 128, "asqwqeqwedf");

        outputStream.writeObject(student);
        outputStream.writeObject(student2);
        outputStream.writeObject(student3);
    }
}
