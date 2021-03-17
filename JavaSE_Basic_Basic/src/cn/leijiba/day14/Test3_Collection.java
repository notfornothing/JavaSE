package cn.leijiba.day14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;

/**
 * @Author notfornothing
 * @Date 2021/3/17 15:34
 */
public class Test3_Collection {
    public static void main(String[] args) {
        method1();
        method2();
    }

    private static void method2() {

    }

    private static void method1() {

        List<Integer> List = new ArrayList();
        List.add(100);
        List.add(200);
        List.add(300);
        List.add(400);
        List.add(500);
        System.out.println(List);
        System.out.println(List.hashCode());
        System.out.println(List.size());
        System.out.println(List.contains(100));
        System.out.println(List.remove(100));
        System.out.println(List);
        System.out.println("================");
        List<Integer> c2 = new ArrayList<>();
        c2.add(1);
        c2.add(1);
        c2.add(1);
        c2.add(1);
        List.addAll(c2);
        System.out.println(List);
        List.containsAll(c2);
       List<Integer> List1 = new ArrayList();
        Collections.copy(List1, c2);
        Iterator<Integer> iterator = List.iterator();
        System.out.println("==========");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
