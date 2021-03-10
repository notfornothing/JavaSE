package cn.leijiba.day08;

import java.util.function.DoubleToIntFunction;

/**
 * @Author notfornothing
 * @Date 2021/3/9 16:13
 */
public class TestDuoTai2Important {
    public static void main(String[] args) {
        Dog2 dog2 = new Dog2();
        System.out.println(dog2.sum);
        dog2.eat();
        dog2.play();
        System.out.println("==========");

        Animal2 animal2 = new Dog2();
        System.out.println(animal2.sum);
        animal2.eat();
        animal2.play();
    }
}
class Animal2{
    int sum=10;

    public void eat() {
        System.out.println("eat anything");
    }
    public static void play() {

        System.out.println("play Anything");
    }
}

class Dog2 extends Animal2 {
    int sum=20;

    public void eat() {
        System.out.println("小狗要eat meat");
    }

    public static void play() {

        System.out.println("dog like turning");
    }
}
