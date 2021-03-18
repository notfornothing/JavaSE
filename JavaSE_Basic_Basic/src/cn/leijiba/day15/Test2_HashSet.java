package cn.leijiba.day15;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @Author notfornothing
 * @Date 2021/3/18 15:11
 */
public class Test2_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(123);
        hashSet.add(122133);
        hashSet.add(3333);
        hashSet.add(555);
        System.out.println(hashSet);
    }
}
