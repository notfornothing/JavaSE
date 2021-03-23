package cn.leijiba.day17;

import javax.naming.NameNotFoundException;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @Author notfornothing
 * @Date 2021/3/22 15:41
 */
public class Singleton2 {


    public static void main(String[] args) {
        System.out.println(MySingle2.getSingle2());
        System.out.println(MySingle2.getSingle2());
        new Thread(new FutureTask<Integer>(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return null;
            }
        }));

    }
}

class MySingle2 {


    private MySingle2() {

    }

    private static MySingle2 single;

   static Object o = new Object();

    public  static  MySingle2  getSingle2() {
        synchronized (o) {
            if (single == null) {
                single = new MySingle2();
            }
            return single;
        }
    }
}