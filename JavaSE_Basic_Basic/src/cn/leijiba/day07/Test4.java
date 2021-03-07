package cn.leijiba.day07;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * @Author notfornothing
 * @Date 2021/3/7 16:30
 */
public class Test4 {

    public static void main(String[] args) {
        Car c = new Car();//123645
        c.show();
        Car c2 = new Car();//23
    }
}

public class Car {
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