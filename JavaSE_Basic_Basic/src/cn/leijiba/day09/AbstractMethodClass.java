package cn.leijiba.day09;
/**本类用于测试抽象类入门案例*/
public class AbstractMethodClass {
    //6.创建入口函数
    public static void main(String[] args) {
        //7.创建多态对象进行测试
        Animal2 a = new Pig();
        a.eat();//调用抽象父类的普通方法
        a.fly();//调用抽象父类的抽象方法,子类干活
        /**4.抽象类不可以创建对象(实例化)!!!*/
        //Animal2 a2 = new Animal2();
    }
}
//1.创建父类
/**2.被关键字abstract修饰的类称为抽象类
 * 如果一个类中包含抽象方法,那么这个类必须被声明成抽象类*/
abstract class Animal2{
    //3.创建普通方法
    public void eat() {
        System.out.println("吃啥都行");
    }
    public void play() {
        System.out.println("玩啥都行");
    }
    public void  method(){}
    //4.定义抽象方法fly()
    /**1.没有方法体的方法叫做抽象方法,被关键字abstract修饰*/
     abstract void fly();
    public abstract void fly2();

}
//2.创建子类
/**3.当子类继承了抽象父类后
 * 要不变成一个抽象子类,要不实现父类的所有抽象方法*/
//方案一:抽象子类://abstract class Pig extends Animal2{
//方案二:实现抽象父类中的所有抽象方法
class Pig extends Animal2{

    //5.实现抽象父类中的所有抽象方法
    @Override //注解,相当于标记,标记这是一个重写的方法
    public void fly() {
        System.out.println("我把我爸的债还清啦,我家猪终于能飞了");
    }

    @Override
    public void fly2() {
        System.out.println("父类的第二个抽象方法也实现");
    }

}






