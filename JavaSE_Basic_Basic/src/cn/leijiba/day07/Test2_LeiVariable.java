package cn.leijiba.day07;

/**
 * @Author notfornothing
 * @Date 2021/3/7 14:46
 */
public class Test2_LeiVariable {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.show();
    }
}
class Fu{
    int num=20;
}
class Zi extends Fu{
    int num;

    public void show() {
        int num=9;
    System.out.println(super.num);//父的值
        System.out.println(this.num  );//默认值
        System.out.println(num);//方法里的值
    }
}
