package cn.leijiba.day07;
/**本类用于测试继承中成员方法的使用*/

public class ConstructorExtends  {
    int i;
    //父类最好还是加上无参构造
    ConstructorExtends(int j) {
        System.out.println("FFFFFFF");
    }
}

class Z extends ConstructorExtends{
    int i;
    Z() {
        super(1);
        System.out.println("ZZZZZZZZ");
    }
    public static void main(String[] args) {
        Z z = new Z();
    }
}









