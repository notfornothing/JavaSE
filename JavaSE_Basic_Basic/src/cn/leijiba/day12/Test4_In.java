package cn.leijiba.day12;

import sun.awt.image.InputStreamImageSource;

import java.io.*;

/**
 * @Author notfornothing
 * @Date 2021/3/15 17:11
 */
public class Test4_In {
    public static void main(String[] args) {
        method1();
        method2();
    }

    private static void method2() {
        InputStream in = null;

        try {
            in = new FileInputStream(new File("C:\\Users\\Administrator\\Desktop\\2.txt"));
            BufferedInputStream bufferedInputStream = new BufferedInputStream(in);
            int b = 0;
            while ((b=in.read())!=-1) {
                System.out.println(b);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void method1() {
        InputStream in = null;

        try {
            in = new FileInputStream(new File("C:\\Users\\Administrator\\Desktop\\2.txt"));
            int b = 0;
            while ((b=in.read())!=-1) {
                System.out.println(b    );
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
