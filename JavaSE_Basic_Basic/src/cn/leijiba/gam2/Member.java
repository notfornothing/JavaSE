package cn.leijiba.gam2;

import java.util.ArrayList;
import java.util.Random;

/**
 * @Author notfornothing
 * @Date 2021/3/14 14:50
 */
public class Member extends User{
    public ArrayList<Integer> getMoney(ArrayList<Integer> arrayList) {
        int index = new Random().nextInt(arrayList.size());
        Integer integer = arrayList.get(index);
        setNum(getNum()+integer);
        arrayList.remove(index);
        return arrayList;
    }

    public Member() {
    }

    public Member(int num, String name) {
        super(num, name);
    }
}
