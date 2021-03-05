package cn.leijiba.classProblemPacakge1;

/**
 * @Author notfornothing
 * @Date 2021/3/5 16:22
 */
public class Child  extends Father{
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println("和父类同一个包下的子类"+",private修饰的成员变量访问不了");
        System.out.println("和父类同一个包下的子类"+child.param2);
        System.out.println("和父类同一个包下的子类"+child.param3);
        System.out.println("和父类同一个包下的子类"+child.param4);
    }

}
