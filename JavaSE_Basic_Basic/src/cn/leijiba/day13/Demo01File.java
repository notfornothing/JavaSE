package cn.leijiba.day13;

import java.io.File;

/**
 * @Author notfornothing
 * @Date 2021/3/16 19:44
 */
public class Demo01File {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Administrator\\Desktop\\11.jpg");

        System.out.println(file);
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());

        System.out.println(file.getName());

        System.out.println(file.length());
        file = new File(".");
        System.out.println(file.getAbsoluteFile());
    }
}
