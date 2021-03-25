package cn.leijiba.day19;

import com.sun.media.jfxmedia.events.PlayerEvent;
import com.sun.media.sound.SoftTuning;

/**
 * @Author notfornothing
 * @Date 2021/3/24 16:09
 */
public class TestInner5 {
    public static void main(String[] args) {
        Inner1 inner1 = new Inner1() {
            @Override
            public void get() {
                System.out.println("ksadjflasf");
            }

            public void save() {
               //这不是重写
            }

            @Override
            public void method1() {

            }
        };


        Inner2 inner2 = () -> {
            System.out.println("matherFuckerr");
        };

        new Inner3() {
            @Override
            public void test() {

            }

            public void play() {
               super.play();
                System.out.println("123");
            }
        }.play();

        new Inner4() {
            @Override
            public void p() {
                System.out.println("shit");
            }
        };
    }
}

interface Inner1 {
    void get();

 public static    void save() {
     System.out.println("asdf");
 }

    public abstract void method1();
}

interface Inner2 {
    void lamad();
}

abstract class Inner3 {
    public void play() {
        System.out.println("Iam the paly");
    }

    public abstract void test();

}
class Inner4{
    public void p() {
        System.out.println("asdf");
    }
}