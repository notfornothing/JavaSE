package cn.leijiba.day19;

/**
 * @Author notfornothing
 * @Date 2021/3/24 15:33
 */
public class TestInner4 {
    public static void main(String[] args) {
        new Outer4().show();

    }
}
class Outer4{
    public void show() {
        class Inner4{
            String name;
            int age;

            public void eat() {
                System.out.println("eat shitttt!!!");
            }
        }
        Inner4 inner4 = new Inner4();
        System.out.println(inner4.age);
        System.out.println(inner4.name);
        inner4.eat();
    }

}
