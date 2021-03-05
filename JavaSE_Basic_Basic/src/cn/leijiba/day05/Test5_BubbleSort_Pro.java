package cn.leijiba.day05;

import java.util.Random;
/**
 * @Author notfornothing
 * @Date 2021/3/5 10:00
 */

public class Test5_BubbleSort_Pro {
    public static void main(String[] args) {
        int[] arr = getArr();
        int[] sort = getSort(arr);
        System.out.println();
        for (int i  :sort
        ) {
            System.out.print(i+" ");
        }

    }

    private static int[] getSort(int[] arr) {
        int temp;
        boolean flag=false;
        for (int i = 0; i < arr.length; i++) {
            flag = true;
            for (int j = 0; j < arr.length-1-i; j++) {//把xiao的浮上去


                if (arr[j+1] > arr[j]) {//
                    temp=arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag=false;
                }
            }
            if (flag) {
                break;
            }

            System.out.println();
            System.out.print(i+" : ");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j]+" ");
            }

        }
        return arr;
    }

    private static int[] getArr() {
        Random r = new Random();
        int[] arr = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = r.nextInt(100);
        }
        for (int i :
                arr) {
            System.out.print(i + " ");
        }
        return arr;
    }
}
