package cn.leijiba.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author notfornothing
 * @Date 2021/3/19 16:43
 */
public class XW {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        list.add("sad");
        list.add("sadasdasd");
        list.add("sad");
        list.add("sad");
        list.add("sadasdsad");
        map.put("key", list);
        boolean b = list instanceof Object;
        System.out.println(b);
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "==>" + entry.getValue());
        }

        System.out.println("==================");
        for (String s : map.keySet()) {
            System.out.println(s + "==>" + map.get(s));
        }
    }
}
