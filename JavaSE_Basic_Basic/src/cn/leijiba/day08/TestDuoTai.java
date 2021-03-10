package cn.leijiba.day08;

/**
 * @Author notfornothing
 * @Date 2021/3/9 15:08
 */
public class TestDuoTai {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.eat();
        animal.eat();
        //animal.jump();
        //父类无法使用子类特有方法
        Cat cat = new Cat();
        cat.eatFish();


    }
}
class  Animal{
    public void eat() {
        System.out.println("Animal Eat every thing");
    }
}

class Cat extends Animal {
    public void eat() {
        System.out.println("eat Fish");
    }

    public void eat(int i) {
        System.out.println("int i eat");
    }
    public void eatFish() {
        System.out.println("Cat eat Fish");
    }

    public void jump() {
        System.out.println("cat Jump!!!!!!");
    }
}
