package cn.leijiba.test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author notfornothing
 * @Date 2021/3/6 17:29
 */

/*
键盘录入一个字符串，要求长度为8，
不符合输出错误；符合条件，将字符串中所有大写字符替换成'M'
 */

public class TestDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String next = sc.next();
        char[] chars = new char[0];
        if (next.length() > 8) {
            System.out.println("wrong input");
        } else {
            chars = next.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] - 'A' >= 0 && chars[i] - 'Z' <= 0) {
                    chars[i] = 'M';
                }
            }
        }
        System.out.println(Arrays.toString(chars));
    }
}
