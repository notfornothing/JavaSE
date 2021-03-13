package cn.leijiba.day11;

import java.util.Arrays;

/**
 * @Author notfornothing
 * @Date 2021/3/12 15:29
 */
//test the effective of String StringBuffer StringBuilder
public class Test3_String2 {
    public static void main(String[] args) {
        String s = "asdfasdfjldsakjflksadj";
        StringBuffer result = new StringBuffer(" ");
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            result.append(s);
        }
        byte[] bytes = s.getBytes();
        long t2 = System.currentTimeMillis();
        String s1 = new String(bytes);
        System.out.println(result);
        System.out.println(t2-t1);
        System.out.println(Arrays.toString(bytes));
        System.out.println(s1);

    }
}
