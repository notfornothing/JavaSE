package cn.leijiba.day20;

import java.io.*;

import static cn.leijiba.day10.Java8InterDefault.method3;


/**
 * @Author notfornothing
 * @Date 2021/3/25 16:31
 */
public class TestIO {
    public static void main(String[] args) throws IOException {
        method3();
    }

    private static void method3() throws IOException {

        PrintWriter printWriter = new PrintWriter("C:\\Users\\Administrator\\Desktop\\3.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Administrator\\Desktop\\2.txt"));

        String s = null;
        while ((s = bufferedReader.readLine()) != null) {

            printWriter.println(s);

        }
        printWriter.flush();
    }

    private static void method1() throws FileNotFoundException {

        PrintWriter printWriter = new PrintWriter("C:\\Users\\Administrator\\Desktop\\3.txt");
        printWriter.println(111);
        printWriter.println("sadf");
        printWriter.flush();
    }

    private static void method() throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Administrator\\Desktop\\2.txt"));
        String s = null;
        while (( s = in.readLine()) != null){
            System.out.println(s);
        }
    }

}
