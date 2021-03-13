package cn.leijiba.day11;

/**
 * @Author notfornothing
 * @Date 2021/3/13 19:39
 */
public class MainAboutMyCustom {
    public static void main(String[] args) {
        MyCustomZi myCustomZi = new MyCustomZi(1, "qqq", new MyCustom(2, "asdf"));
        System.out.println(myCustomZi);


    }
}
