package cn.leijiba.classProblemPacakge1;

/**
 * @Author notfornothing
 * @Date 2021/3/5 16:18
 * Java四种访问控制权限
 */
public class Father {
    private String param1 ="这是private";//
    protected String param2 ="这是protected";
    public String param3 = "这是public";
    String param4 ="这是default";

    /*
    测试这个类里面能不能都调用
     */
    public static void main(String[] args) {
        Father father = new Father();
        System.out.println("自己类本身访问"+father.param1);
        System.out.println("自己类本身访问"+father.param2);
        System.out.println("自己类本身访问"+father.param3);
        System.out.println("自己类本身访问"+father.param4);

    }
}
