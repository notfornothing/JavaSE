package cn.leijiba.game;

import java.util.Random;

/**
 * @Author notfornothing
 * @Date 2021/3/11 16:54
 */
public class AK47 {
    private int bullet;

    public int getBullet() {
        return bullet;
    }

    public void reload(int i) {
        setBullet(i);
    }

    public AK47(int bullet) {
        this.bullet = bullet;
    }

    public void setBullet(int bullet) {
        this.bullet = bullet;
    }

    public int fire() {

        int i = new Random().nextInt(10);
        bullet = bullet - i;
        if (bullet <= 0) {
            for (int j = 0; j < -bullet; j++) {
                System.out.print("突");
            }
            bullet =0;
            System.out.println("no bullet left");
            return -bullet;
        }
        for (int j = 0; j < i; j++) {
            System.out.print("突");
        }
        System.out.println();
        return i;
    }

    public void load(int i) {
        bullet = i;
    }
}
