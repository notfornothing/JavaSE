package cn.leijiba.day15;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author notfornothing
 * @Date 2021/3/18 14:14
 */
public class Test1_Set {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("awsedf");
        set.add("awsedasdfasdff");
        set.add(null);
        System.out.println(set);
        Set<String> set1 = new HashSet<>();
        set1.add("123");
        set1.add("222");
        set1.addAll(set);
        System.out.println(set1);
    }
}
