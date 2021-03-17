package cn.leijiba.day14;

import java.util.ArrayList;

/**
 * @Author notfornothing
 * @Date 2021/3/17 14:40
 */
public class Test2_Generic2 {

    public static void main(String[] args) {
   Integer[] a = {1, 2, 3, 21, 31, 23, 12, 312, 3,};
        print(a);
    }

    public static <E> void print(E[] e) {
        if (e instanceof Object) {
            for (E e1 : e) {
                System.out.print(e1);
            }
        }
    }

    private static void method1() {
        Integer[] a = {1, 2, 3, 21, 31, 23, 12, 312, 3,};
        for (Integer integer : a) {
            System.out.print(integer);
        }
    }

}
