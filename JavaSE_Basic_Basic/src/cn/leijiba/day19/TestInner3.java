package cn.leijiba.day19;

/**
 * @Author notfornothing
 * @Date 2021/3/24 15:03
 */
public class TestInner3 {

    public static void main(String[] args) {
        Outer3.Inner3 inner3 = new Outer3.Inner3();
        inner3.play();
        Outer3.Inner3.ppplay();
    }
}

class Outer3{
    //static 修饰类并不常有
static   class Inner3{
        public void play() {
            System.out.println("Inner3....");

        }
        public static void ppplay() {
        System.out.println("asdfasdfasdf");
    }
    }
}