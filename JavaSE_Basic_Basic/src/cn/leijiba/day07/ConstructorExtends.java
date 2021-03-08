package cn.leijiba.day07;
/**本类用于测试继承中成员方法的使用*/

public class ConstructorExtends  {
    int i;
    ConstructorExtends() {
        System.out.println("FFFFFFF");
    }
}

class Z extends ConstructorExtends{
    int i;
    Z() {
        System.out.println("ZZZZZZZZ");
    }
    public static void main(String[] args) {
        Z z = new Z();
    }
}









