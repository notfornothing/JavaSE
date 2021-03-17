package cn.leijiba.game2;

/**
 * @Author notfornothing
 * @Date 2021/3/14 14:43
 */
public class User {
   private int num;
    private String name;

    public void show() {

        System.out.println("I am :" + name + " , I have " + num);
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public User() {
    }

    public User(int num, String name) {
        this.num = num;
        this.name = name;
    }
}
