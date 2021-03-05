package cn.leijiba.classProblemPacakge2;

import cn.leijiba.classProblemPacakge1.Father;

/**
 * @Author notfornothing
 * @Date 2021/3/5 16:40
 */
public class Child2 extends Father {

    public static void main(String[] args) {
        Child2 child2 = new Child2();
        System.out.println("和父类不同包"+"private修饰的成员变量访问不了");
        System.out.println("和父类不同包"+child2.param2);
        System.out.println("和父类不同包"+child2.param3);
        System.out.println("和父类不同包"+"default修饰的成员变量访问不了");
    }
}
