package cn.leijiba.day16;

import java.io.CharArrayReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
*@Author notfornothing
*@Date 2021/3/19 10:13
*/
public class Test1_HashMap {
    //记得给key排序
    /**
     * 初始容量是16 -->1 <<4 = 1*2^4
     * 加载因子:0.75f
     * 如果容量达到了提到的初始容量与加载因子的乘积,需要扩容
     * 扩容会重新开辟空间,重新计算所有元素的位置,也叫rehash
     * 所以我们在设计初始容量与加载因子的时候要相对平衡
     * 如果加载因子过低,则rehash过于频繁,影响性能
     * 如果初始容量设置的太高或者是加载因子过高,会影响查询效率
     * */
    public static void main(String[] args) {
        System.out.println("输入字符串,回车结束");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char aChar : chars) {
            if (map.containsKey(aChar)) {
                Integer integer = map.get(aChar);
                integer++;
                map.put(aChar, integer);
            } else {
                map.put(aChar, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey()+"==" +entry.getValue());
        }
    }
}
