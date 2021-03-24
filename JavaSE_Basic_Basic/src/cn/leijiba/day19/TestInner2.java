package cn.leijiba.day19;

/**
 * @Author notfornothing
 * @Date 2021/3/24 14:23
 */
public class TestInner2 {

    public static void main(String[] args) {
        Outer2 outer2 = new Outer2();
        outer2.useStudy();
    }
}

class Outer2{
    private class Inner2 {
        public void study() {
            System.out.println("Inner2.......");
        }
    }

    public void useStudy() {
        Inner2 inner2 = new Inner2();
        inner2.study();
    }
}