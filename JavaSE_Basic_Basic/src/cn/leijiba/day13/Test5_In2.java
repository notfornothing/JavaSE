package cn.leijiba.day13;

import java.io.*;

/**
*@Author notfornothing
*@Date 2021/3/16 10:15
*/
public class Test5_In2 {
    public static void main(String[] args) {
        method1();//普通字符流

        method2();//高效
    }

    private static void method2() {

        BufferedReader bufferedReader= null;
        try {
            bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Administrator\\Desktop\\87fe2c4ce4.jpg"));
            int b;
            while ((b = bufferedReader.read()) != -1) {
                System.out.println(b);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                bufferedReader.close();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }


    }

    private static void method1() {
        Reader in = null;
        try {
            in = new FileReader(new File("C:\\Users\\Administrator\\Desktop\\87fe2c4ce4.jpg"));
            int b = 0;
            while ((b = in.read())!= -1) {

                System.out.println(b);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}