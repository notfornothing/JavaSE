package cn.leijiba.day17;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author notfornothing
 * @Date 2021/3/22 16:49
 */
public class OOPTest {
    public static void main(String[] args) {
        B b = new B();
//A静态代码块
//B静态代码块
//A构造代码块
//A的构造方法
//B造代码块
//B构造方法/
    }
}
class A{
    static {
        System.out.println("A静态代码块");
    }
    {
        System.out.println("A构造代码块");
    }
    public A() {
        System.out.println("A的构造方法");
    }
}
class B extends A{
    static {
        System.out.println("B静态代码块");
    }
    {
        System.out.println("B造代码块");
    }
    public B() {
        super();
        System.out.println("B构造方法");
    }
}