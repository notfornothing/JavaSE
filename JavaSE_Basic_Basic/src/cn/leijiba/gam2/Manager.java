package cn.leijiba.gam2;

import java.util.ArrayList;

/**
 * @Author notfornothing
 * @Date 2021/3/14 14:45
 */
public class Manager extends User{

    public ArrayList<Integer> send(int num, int count) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (getNum() < num) {
            System.out.println("no money to share");
            return arrayList;
        }
        setNum(super.getNum()-num);
        int level = num / count;
        int level_left = num % count;
        for (int i = 0; i < count-1; i++) {
            arrayList.add(level);
        }
        arrayList.add(level + level_left);
        return arrayList;
    }

    public Manager() {
    }

    public Manager(int num, String name) {
        super(num, name);
    }
}
