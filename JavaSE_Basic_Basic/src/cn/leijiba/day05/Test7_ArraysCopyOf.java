package cn.leijiba.day05;

import java.util.Arrays;

/**
 * @Author notfornothing
 * @Date 2021/3/5 12:52
 */
public class Test7_ArraysCopyOf {
    public static void main(String[] args) {
        int[] from = {1, 2, 3, 4, 5};
        int[] to = Arrays.copyOf(from, 4);
        int[] to2 = Arrays.copyOf(from, 10);
        System.out.println(Arrays.toString(to));
        System.out.println(Arrays.toString(to2));
        int[] to3 = Arrays.copyOfRange(from, 3, 4);
        System.out.println(Arrays.toString(to3));
    }
}
