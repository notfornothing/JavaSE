package cn.leijiba.day12;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * @Author notfornothing
 * @Date 2021/3/15 14:12
 */
public class Test2_File {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Administrator\\Desktop\\1.txt");
        System.out.println(file.length());
        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getAbsolutePath());

        file = new File("C:\\Users\\Administrator\\Desktop\\2.txt");
        System.out.println(file.createNewFile());
        System.out.println("================");
        String sb="C:\\Users\\Administrator\\Desktop\\test\\"  ;
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < 5555; i++) {
            stringBuilder = new StringBuilder(sb+"\\"+i);
            file = new File(String.valueOf(stringBuilder));
            System.out.println(file.mkdirs());
            file.mkdir();
            stringBuilder = new StringBuilder(sb + "\\" + i+".txt");
            file = new File(String.valueOf(stringBuilder));
            file.createNewFile();
            System.out.println(sb);
        }
        file = new File("C:\\Users\\Administrator\\Desktop\\test\\");
        String[] list = file.list();
        System.out.println(Arrays.toString(list));
        System.out.println("===========");

        File[] files = file.listFiles();
        System.out.println(Arrays.toString(files));
        System.out.println(files[0].length());
    }
}
