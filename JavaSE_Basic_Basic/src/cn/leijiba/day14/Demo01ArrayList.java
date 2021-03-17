package cn.leijiba.day14;

import java.util.ArrayList;

/**
 * @Author notfornothing
 * @Date 2021/3/17 14:10
 */
public class Demo01ArrayList {
    public static void main(String[] args) {
        String[] s = new String[5];
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(3123123);
        arrayList.add(312312313);
        System.out.println(arrayList);

    }
}
