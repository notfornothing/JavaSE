package cn.leijiba.day15;

import java.util.LinkedList;

/**
 * @Author notfornothing
 * @Date 2021/3/18 11:21
 */
public class Test6_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("qwe");
        list.add("qwe");
        list.add("qwe");
        list.add("lklkj");
        list.add("lklkj");
        list.add("lklkj");
        System.out.println(list);
        list.addFirst("asdfasdf");
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.getFirst());
        System.out.println("========");
        System.out.println(list.getLast());
        System.out.println(list.get(list.size()-1));
        LinkedList<String> list1 = new LinkedList<>(list);
        System.out.println(list1);
    }

}
