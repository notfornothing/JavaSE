package cn.leijiba.test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author notfornothing
 * @Date 2021/3/6 17:37
 */

/*
自定义方法 将字符串中所有偶数转为int[] 数组，
再对数组冒泡排序，最后使用Arrays输出数组
*/
public class TestDemo2 {
    public static void main(String[] args) {
        System.out.println("输入字符串数字,空格隔开");
        int[] num = getArr();
        int[] num_2 = getArr_2(num);
        int[] num_sort = getSort(num_2);
        System.out.println("你输入的为:" + Arrays.toString(num));
        System.out.println("处理后的为:" + Arrays.toString(num_2));
        System.out.println("排序后的为:" + Arrays.toString(num_sort));
    }

    //优化版冒泡 从小到大
    private static int[] getSort(int[] num) {
        int [] num_2 = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            num_2[i] = num[i];
        }
        int temp=0;

        boolean flag = false;
        for (int i = 0; i < num_2.length-1; i++) {
            flag = false;
            for (int j = 0; j < num_2.length -i-1; j++) {
                if (num_2[j] > num_2[j+1]) {
                    temp = num_2[j];
                    num_2[j] = num_2[j+1];
                    num_2[j+1] = temp;
                    flag = true;
                }
            }
            if (flag == false) {
                break;
            }
        }
        return num_2;
    }

    private static int[] getArr_2(int[] num) {
        int[] result = new int[num.length];
        int j = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                result[j] = num[i];
                j++;
            }
        }
        int j_final=j;
        int[] result_final = new int[j_final];
        for (int i = 0; i < result_final.length; i++) {
            result_final[i] = result[i];
        }


        return result_final;
    }


    private static int[] getArr() {
        Scanner sc = new Scanner(System.in);
        //这里为了拽一下,其实可以nextInt
        String next = sc.nextLine();
        //我这里是装蠢,为了多了解到一些方法

        char[] charArray = next.toCharArray();

        int[] nums = new int[charArray.length];
        int temp = 0;
        int c = 0;
        int nums_length = 1;
        boolean flag = false;
        if (charArray[0] == ' ') {
            flag = true;
        }
        if (charArray[charArray.length - 1] == ' ') {
            nums_length--;
        }
        for (int i = 0, j = 0; i < charArray.length; i++) {

            if (j < charArray.length && charArray[j] == ' ') {

                //判断是否连着的空格
                if (flag) {
                    j = j + 1;
                    i = i - 1;
                } else {
                    j = j + 1;
                    i = i - 1;
                    nums_length++;
                }

                flag = true;
                continue;
            }
            flag = false;

            c = j;
            while (j < charArray.length && charArray[j] != ' ') {
                j = j + 1;
            }

            for (int l = 0; l < j - c; l++) {
                temp = (temp + charArray[c + l] - '0');
                temp = temp * 10;
            }
            nums[i] = temp / 10;
            temp = 0;
        }
        int[] nums_final = new int[nums_length];

        //
        for (int i = 0; i < nums_length; i++) {
                nums_final[i] = nums[i];
        }
        return nums_final;
        //TMD 再也不作死了,搞了老子快一天了.呜呜呜
    }
}

