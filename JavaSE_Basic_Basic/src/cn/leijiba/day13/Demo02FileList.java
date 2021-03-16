package cn.leijiba.day13;

import sun.font.FontRunIterator;

import java.io.File;
import java.io.FileFilter;
import java.util.Locale;

/**
 * @Author notfornothing
 * @Date 2021/3/16 20:12
 */
public class Demo02FileList {

    public static void main(String[] args) {

        File file = new File("./");
        System.out.println(file.getAbsoluteFile());

        File[] files1 = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getAbsoluteFile().toString().toLowerCase().endsWith(".md");
            }
        });
        for (File file1 : files1) {
            System.out.println(file1);
        }


        File[] files = file.listFiles((pathname -> pathname.getAbsoluteFile().toString().toLowerCase().endsWith(".iml")));
        for (File file1 : files) {
            System.out.println(file1);
        }
    }




}
