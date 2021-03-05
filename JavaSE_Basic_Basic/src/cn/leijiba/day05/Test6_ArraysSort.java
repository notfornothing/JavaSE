package cn.leijiba.day05;

import java.util.Arrays;

/**
 * @Author notfornothing
 * @Date 2021/3/5 10:07
 */
public class Test6_ArraysSort {
    public static void main(String[] args) {
        int[] a =new int[] {21, 213, 12, 323, 5, 7, 65756};
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(a);
        System.out.println(Arrays.toString(a));
    }
}
