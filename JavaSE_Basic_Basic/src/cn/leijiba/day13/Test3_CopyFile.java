package cn.leijiba.day13;

import java.io.*;
import java.util.Scanner;

/**
 * @Author notfornothing
 * @Date 2021/3/16 15:40
 */
public class Test3_CopyFile {

    public static void main(String[] args) {


        File from = new File(new Scanner(System.in).next());
        File to = new File(new Scanner(System.in).next());
        ZJCopy(from, to);

    }

    private static void ZJCopy(File from, File to) {
       InputStream is = null;
        OutputStream os = null;
        BufferedOutputStream bos;
        BufferedInputStream bis;
        try {
             bis = new BufferedInputStream(new FileInputStream(from));
             bos = new BufferedOutputStream(new FileOutputStream(to));
            int b = 0;
            while ((b = bis.read()) != -1) {

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
