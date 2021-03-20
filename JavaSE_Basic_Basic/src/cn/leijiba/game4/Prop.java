package cn.leijiba.game4;

/**
 * @Author notfornothing
 * @Date 2021/3/17 21:07
 */

import org.junit.Test;

import java.io.*;
import java.security.Key;
import java.security.Policy;
import java.util.*;
/**
 * # 自己弄个文件复制的
 * ---
 * # Properties
 * ---
 * 和IO流结合看et relativenumbepublic void f(){
 */
public class Prop {
    //获取配置文件的 键值对 返回map集合
    public static Map<String, String> getMap(String fileName) throws IOException {
        Properties properties = new Properties();
        properties.load(new BufferedReader(new FileReader(fileName)));
        Set<String> set = properties.stringPropertyNames();
        Map<String, String> map = new HashMap<>();
        for (String s : set) {

            map.put(s, properties.getProperty(s));
        }
        return map;
    }


    //<key from,value to>
    //设置值.
    public static boolean storeProp(String fileName,Map<String,String> map) throws Exception {
        Properties properties = new Properties();
        properties.load(new FileReader(fileName));
        Set<Map.Entry<String, String>> entries = map.entrySet();
        Iterator<Map.Entry<String, String>> it = entries.iterator();
        for (int i = 0; i < map.size(); i++) {
            Map.Entry<String, String> next = it.next();
            properties.setProperty(next.getKey(), next.getValue());
        }
        String s = "左边源文件,右边是目的地";
        properties.store(new FileWriter(fileName), s);
        return true;
    }
    //优化版冒泡 从小到大
    private static int[] getSort(int[] num) {
        int [] num_2 = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            num_2[i] = num[i];
            System.out.println(Test.class);

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
        String name = new String();
        boolean flag = false;
        if (charArray[0] == ' ') {
            flag = true;
        }
        if (charArray[charArray.length - 1] == ' ') {
            nums_length--;
        }
        for (int i = 0, j = 0; i < charArray.length; i++) {
            if (j < charArray.length && charArray[j] == ' ') {

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
