package cn.leijiba.game;

import java.util.Random;

/**
 * @Author notfornothing
 * @Date 2021/3/11 15:45
 */
public class Soldier {
  private   String id;
  private   int blood;
   private   AK47 ak47;



    public void setId(String id) {
        this.id = id;
    }



    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public AK47 getAk47() {
        return ak47;
    }

    public void setAk47(AK47 ak47) {
        this.ak47 = ak47;
    }

    public void go() {
        System.out.println("running");
    }

    public void attack( int damage) {
        int i = damage;//[0,10)
        if (blood == 0) {
            System.out.println("这是尸体");
            return;
        }
        blood = blood - i;
        if (blood <=0) {
            blood =0;
            System.out.println("攻击了: " + i+" 伤害");
            System.out.println("士兵 "+id  +" 还剩 "  + blood);
            System.out.println("士兵 "+id  +"died");
            return;
        }
        System.out.println("攻击了: " + i+" 伤害");
        System.out.println("士兵 "+id  +" 还剩 "  + blood);
    }
}
