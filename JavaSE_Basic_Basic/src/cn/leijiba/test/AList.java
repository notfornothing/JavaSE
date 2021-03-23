package cn.leijiba.test;

import org.junit.Test;

import java.util.ArrayList;

/**
 * @Author notfornothing
 * @Date 2021/3/15 19:41
 */
public class AList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("adsf");
        arrayList.add("laksdfjalsdkfjafsldkj");
        arrayList.add("ooooo");
        arrayList.add("qqqqqq");
        arrayList.add("wwwww");
        System.out.print("{");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) );
            if (i == arrayList.size() - 1) {
                System.out.println("}");
                break;
            } else  {
                System.out.print("@");
            }
            System.out.println("asdlf");
        }
    }
}
