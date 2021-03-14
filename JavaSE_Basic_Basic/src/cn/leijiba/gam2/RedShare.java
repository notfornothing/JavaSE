package cn.leijiba.gam2;

import java.util.ArrayList;

/**
 * @Author notfornothing
 * @Date 2021/3/14 14:56
 */
public class RedShare {
    public static void main(String[] args) {
        Manager manager = new Manager(100,"Boss");
Member member1 = new Member(0, "m1");
        Member member2 = new Member(0, "m1");
        Member member3 = new Member(0, "m1");
        manager.show();
        member1.show();
        member2.show();
        member3.show();
        System.out.println("+=====================");
        ArrayList<Integer> redList = manager.send(100, 3);
        member1.getMoney(redList);
        member2.getMoney(redList);
        member3.getMoney(redList);
        manager.show();
        member1.show();
        member2.show();
        member3.show();


    }
}
