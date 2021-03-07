package cn.leijiba.day07;

/**
 * @Author notfornothing
 * @Date 2021/3/7 13:45
 */

//这是构造代码块 优先于构造方法执行
class c {

    String country ;
    {
        country = "USA";
    }

    public c() {
        System.out.println("come from " + country);
    }
    public c(int a) {
        System.out.println("2 come from" + country);
    }

    public static void main(String[] args) {
        c c = new c(22);

    }
}

