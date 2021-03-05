package cn.leijiba.day05;

import java.util.Arrays;

/**
 * @Author notfornothing
 * @Date 2021/3/5 14:29
 */
public class Test8_TwoLevelArr {
    public static void main(String[] args) {
        int[][] a = {{3,5},{7,9},{1,2}};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+" ");

            }
            System.out.println();
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(Arrays.toString(a[i]));
        }
    }
}
