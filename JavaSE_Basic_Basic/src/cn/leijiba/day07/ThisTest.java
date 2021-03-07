package cn.leijiba.day07;

/**
 * @Author notfornothing
 * @Date 2021/3/7 14:22
 */
public class ThisTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.run("lucy");
        System.out.println(animal.name);

    }
}
class Animal{
    String name;
    public void run(String name) {
        this.name = name;
    }
}
