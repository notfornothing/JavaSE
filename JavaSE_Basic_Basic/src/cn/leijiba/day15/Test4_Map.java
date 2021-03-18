package cn.leijiba.day15;

import com.sun.media.sound.SoftTuning;

import java.util.*;

/**
 * @Author notfornothing
 * @Date 2021/3/18 16:29
 */
public class Test4_Map {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();

        map.put("1", "2");
        map.put("2", "23");
        map.put("44","3244");
        map.put("4ssss","3244");
        String remove = map.remove("1");
        System.out.println(map);
        Collection<String> values = map.values();
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.get(map.keySet()));
        Set<String> set = map.keySet();
        Iterator<String> iterator = set.iterator();
        System.out.println("===================");
        for (int i = 0; i < set.size(); i++) {
            String next = iterator.next();
            System.out.print(next+":"+ map.get(next));
            System.out.println();
        }
        System.out.println("=========================");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
