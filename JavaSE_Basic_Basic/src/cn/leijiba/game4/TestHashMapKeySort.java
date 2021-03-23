package cn.leijiba.game4;

import java.util.*;

/**
 * @Author notfornothing
 * @Date 2021/3/23 22:05
 */
public class TestHashMapKeySort {
    public static void main(String[] args) {
        method1_valueSort();
    }

    private static void method1_valueSort() {
        HashMap<String, Integer> phone = new HashMap<>();
        phone.put("Apple",7299);
        phone.put("SAMSUNG",6000);
        phone.put("Meizu",2698);
        phone.put("Xiaomi",2400);

        Set<Map.Entry<String, Integer>> entrySet = phone.entrySet();
        ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(entrySet);
        list.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + "==>" + entry.getValue());
        }
    }

    private static void method1_keySort() {
        HashMap<String, Integer> phone = new HashMap<>();
        phone.put("Apple",7299);
        phone.put("SAMSUNG",6000);
        phone.put("Meizu",2698);
        phone.put("Xiaomi",2400);
        System.out.println(phone);
        Set<String> set = phone.keySet();
        Iterator<String> it = set.iterator();
        List<String> list = new ArrayList<>();
        while (it.hasNext()) {
            list.add(it.next());
        }

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        for (String s : list) {
            System.out.println(s+"=>"+phone.get(s));
        }
    }
}
