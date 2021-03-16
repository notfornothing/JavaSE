package cn.leijiba.day13;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**
 * @Author notfornothing
 * @Date 2021/3/16 14:31
 */
public class Test2_Writer {
    public static void main(String[] args) {

        method1();

        method2();
    }

    private static void method2() {

    }

    private static void method1() {
        Writer w = null;
        try {
            w = new FileWriter("C:\\Users\\Administrator\\Desktop\\1qwe.txt",true);
            w.write("hello mother fucker?");
            w.write(98);
            w.write(99);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {

            try {
                w.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
