package cn.leijiba.day13;

import java.io.*;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

/**
 * @Author notfornothing
 * @Date 2021/3/17 9:27
 */
public class Demo01Properties {

    public static void main(String[] args) throws IOException {
        //method1();
        System.out.println("========");
        method2();
    }

    private static void method2() throws IOException {
        Properties prop = new Properties();
        prop.load(new FileReader("./test.txt"));
        Set<String> set = prop.stringPropertyNames();
        for (String s : set) {
            System.out.println(s+ prop.get(s));
        }
    }

    public static void method1() throws IOException {
        Properties prop = new Properties();
        prop.setProperty("lucy", "123");
        prop.setProperty("lucy2", "1234");

        prop.setProperty("lucy22", "1234");

        prop.store(new FileWriter(new File("./test.txt")),"");
        Set<String> set = prop.stringPropertyNames();
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s+prop.getProperty(s));
        }
    }
}
