package cn.leijiba.day07;
/**
 * @Author notfornothing
 * @Date 2021/3/8 19:30
 */

//这个例子挺好的,代码块的执行顺序 GOOD!
public class ConstructTest {

    public static void main(String[] args) {
        Car c = new Car();//123
        c.show();//645
        Car c2 = new Car();//23
    }
}
    class Car{
        //静态代码块
        //1，在类第一次加载时就加载到内存中并一直驻存，
        //并全局共享,直到类消失静态资源才消失
        //2，并且静态资源只被加载一次
        static {
            System.out.println(1);
        }
        //构造代码块
        {
            System.out.println(2);
        }
        //  构造方法
        public Car() {
            System.out.println(3);
        }
        public void show() {
//     局部代码块
            {
                System.out.println(6);
            }
            System.out.println(4);
            System.out.println(5);
        }

}
