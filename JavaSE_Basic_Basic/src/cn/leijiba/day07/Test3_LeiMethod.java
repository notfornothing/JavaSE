package cn.leijiba.day07;

import sun.font.EAttribute;

/**
 * @Author notfornothing
 * @Date 2021/3/7 14:56
 */
public class Test3_LeiMethod {
    public static void main(String[] args) {
        Zi2 zi2 = new Zi2();
        zi2.show();
        zi2.eat();
        zi2.childEat();
    }
}
 class Fu2{
    public void show() {
        System.out.println("Father show");
    }
    public void eat() {
        System.out.println(" Father Eatttttttttt");
    }
}

class Zi2 extends Fu2 {

    @Override
    public void show() {
        System.out.println("Child showwww");

    }

    public void childEat() {
        super.eat();
        System.out.println("lalala");
    }
}