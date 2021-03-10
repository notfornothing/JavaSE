package cn.leijiba.day08;

/**
 * @Author notfornothing
 * @Date 2021/3/9 14:23
 */
public class FinalTest {
    public static void main(String[] args) {
        Son son = new Son();
        son.work();
    }
}

class Father {

    final String name = "working man";
/*final*/    public void work() {
        System.out.println("FFFFFFFFworingkkkkkkkkkkkkkkkkkkkkkkk");
    }
}

class Son extends Father {

    public void work() {
        System.out.println("CCCCCCCCCworingkkkkkkkkkkkkkkkkkkkkkkk");
    }
}