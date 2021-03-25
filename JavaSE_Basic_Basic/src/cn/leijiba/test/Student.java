package cn.leijiba.test;

/**
 * @Author notfornothing
 * @Date 2021/3/24 21:38
 */
public class Student {
    private String name;
    private Integer age;


    private void save(int m, String n) {
        System.out.println("saving+++++"+m+n);
    }


    public void show() {
        System.out.println(name+":"+age);
        System.out.println("hello world");
    }

    private void update() {
        System.out.println("updating!lll!!");
    }
}
