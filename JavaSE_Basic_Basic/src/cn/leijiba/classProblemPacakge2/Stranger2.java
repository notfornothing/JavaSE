package cn.leijiba.classProblemPacakge2;

import cn.leijiba.classProblemPacakge1.Father;

/**
 * @Author notfornothing
 * @Date 2021/3/5 16:46
 */
public class Stranger2 {
    public static void main(String[] args) {
        Father father = new Father();
        System.out.println("和对象的类不同包,不继承父类的类这是: "+"private 访问不了");
        System.out.println("和对象的类不同包,不继承父类的类这是: "+"protected 访问不了");
        System.out.println("和对象的类不同包,不继承父类的类这是: "+father.param3);
        System.out.println("和对象的类不同包,不继承父类的类这是: "+"default 访问不了");

    }
}
