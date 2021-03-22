package cn.leijiba.test;

import java.util.*;

/**
 * @Author notfornothing
 * @Date 2021/3/21 22:53
 */
public class TestForKeySort {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("1", 11);
        map.put("-1", 123);
        map.put("-92", -2213);
        map.put("-33", -88);
        map.put("-5", 0);
        System.out.println(map);
        Set<String> set = map.keySet();
        Iterator<String> it = set.iterator();

        List<String> list = new ArrayList<>();
        while (it.hasNext()) {
        }

        System.out.println(list);
    }
}





















