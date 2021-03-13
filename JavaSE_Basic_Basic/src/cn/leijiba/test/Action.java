package cn.leijiba.test;

import java.util.Arrays;
import java.util.Random;

/**
 * @Author notfornothing
 * @Date 2021/3/13 10:22
 */

public class Action {
//求一个长度为10的数组最大元素, 随机的方式赋值并输出各元素
    public static void main(String[] args) {
        int[] ints = new int[10];
        Random random = new Random();
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt();
        }
        int max = ints[0];
        for (int i = 1; i <ints.length ; i++) {
            if (max < ints[i]) {
                max = ints[i];
            }
        }
        System.out.println("最大值为:"+max);
        System.out.println(Arrays.toString(ints));
    }
}