package cn.leijiba.game;

import java.util.Scanner;

/**
 * @Author notfornothing
 * @Date 2021/3/11 15:54
 */
public class Test1 {
    public static void main(String[] args) {

        Soldier soldier = new Soldier();
        soldier.setBlood(100);
        soldier.setId("number001");
        soldier.setAk47( new AK47(100));
        System.out.println("按回车开始射击");
        String s = new Scanner(System.in).nextLine();
        while (!s.equals("end")) {
            AK47 ak47 = soldier.getAk47();
            if (ak47.getBullet() == 0) {
                if (s.equals("r")) {
                    ak47.reload(30);
                    continue;
                }
                System.out.println("no bullet left");
            } else {
                int damage = ak47.fire();
                soldier.attack(damage);
            }
            s = new Scanner(System.in).nextLine();
        }
    }
}
