package cn.leijiba.classProblemPacakge1;

/**
 * @Author notfornothing
 * @Date 2021/3/5 16:43
 */
public class Stranger {
    public static void main(String[] args) {
        Father father = new Father();
        System.out.println("和对象的类同包,不继承父类的类这是: "+"private 访问不了");
        System.out.println("和对象的类同包,不继承父类的类这是: "+father.param2);
        System.out.println("和对象的类同包,不继承父类的类这是: "+father.param3);
        System.out.println("和对象的类同包,不继承父类的类这是: "+father.param4);
    }
}
