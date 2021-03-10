package cn.leijiba.day09;

/**
 * @Author notfornothing
 * @Date 2021/3/10 15:24
 */
public class AbstractConstructor {
    public static void main(String[] args) {
        Animal3 animal3 = new Pig3();


    }}

abstract class Animal3 {
    public Animal3(int i) {
        System.out.println("Constructor Animal3");
    }

}
class Pig3 extends Animal3 {

    public Pig3() {
        super(1);
        System.out.println("Pig3  Constructor");
    }
}