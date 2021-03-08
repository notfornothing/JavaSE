package cn.leijiba.day07;

/**
 * @Author notfornothing
 * @Date 2021/3/7 14:46
 */
public class Important_Extends {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.show();
        System.out.println("=============");
        Zeng z = new Zi();
        System.out.println("多态可以:"+z.num);
    }
}
class Zeng{
    int num=1;
}
class Fu extends  Zeng{
    int num=2 ;
    int num2=super.num;//只能父类也super.曾父类的成员变量 去赋值
}
class Zi extends Fu{
    int num=3;
    public void show() {
        int num=4;
        int num2= super.num2;
        System.out.println(num2);
        System.out.println(super.num);
        System.out.println(this.num);
        System.out.println(num);
    }
}
