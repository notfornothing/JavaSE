package cn.leijiba.day14;

import java.util.*;
import java.util.stream.Stream;

/**
 * @Author notfornothing
 * @Date 2021/3/17 16:41
 */
public class Test4_List {
    public static void main(String[] args) {
        method1();
    }

    private static void method1() {
        List<String> list = new ArrayList<>();
        list.add("jjjjjjjjjjjjjjjjasdf");
        list.add("asdf");
        list.add("asadsfdf");
        list.add("asdf");
        list.add("asdf");
        list.add("asdf");
        list.add("asdasdfasdff");
        list.add("asdf");

        List<String> list2 = Arrays.asList(new String[list.size()]);
        System.out.println(list);
        Collections.copy(list2, list);
        System.out.println(list2);
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next());
        }
        System.out.println("========");
        List<String> arrayList = new ArrayList<>(list2);

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }
        System.out.println(arrayList);
        System.out.println("======================");
    }
}
