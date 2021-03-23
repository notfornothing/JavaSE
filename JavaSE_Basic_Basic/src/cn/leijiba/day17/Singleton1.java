package cn.leijiba.day17;

/**
 * @Author notfornothing
 * @Date 2021/3/22 15:17
 */
public class Singleton1 {
    public static void main(String[] args) {
        MySingle single = MySingle.getSingle();
        MySingle single1 = MySingle.getSingle();
        System.out.println(single == single1);
        System.out.println(MySingle.getSingle());
        System.out.println(MySingle.getSingle());
    }
}

class MySingle {
    private  MySingle() {
    }

    private static MySingle single = new MySingle();

    public  static MySingle getSingle() {
        return single;
    }

}