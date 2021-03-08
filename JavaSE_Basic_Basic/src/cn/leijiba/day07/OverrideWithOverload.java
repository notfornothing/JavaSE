package cn.leijiba.day07;

import java.sql.SQLOutput;

/**
 * @Author notfornothing
 * @Date 2021/3/8 20:57
 */

/*子类继承父类,重写的那个方法还能重载吗?*/
public class OverrideWithOverload {
    public static void main(String[] args) {
        Child child = new Child();
        child.method();
        child.method();
        child.method();
    }
}

class Father {
    public void method() {
        System.out.println("FFFFFFFFFFFFFFFFFFFFF");
    }

    public void method(int num, int num2) {
        System.out.println("num num2 FFFFFFFFFFF");
    }

}

class Child extends Father{

    @Override
    public void method() {
        System.out.println("CCCCCCCCCCCCCCCCCCCC");
    }

    public void method(int num) {
        System.out.println("num CCCCCCCCCCCCCCCC");
    }
}
