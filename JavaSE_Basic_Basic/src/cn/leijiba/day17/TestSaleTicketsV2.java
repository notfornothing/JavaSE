package cn.leijiba.day17;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author notfornothing
 * @Date 2021/3/22 10:03
 */
public class TestSaleTicketsV2 {
    public static void main(String[] args) {
        SaleTicketsV2 target = new SaleTicketsV2();
        ExecutorService pool = Executors.newFixedThreadPool(5);//创建一个可以调整的
        for (int i = 0; i < 5; i++) {
            pool.execute(target);
        }
    }
}

class SaleTicketsV2 implements Runnable {
    static int tickets = 100;
    Object o = new Object();
    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (tickets > 0) {
                    System.out.println(Thread.currentThread().getName() + "==" + tickets);
                    tickets--;
                } else {
                   break;
                }


            }
        }
    }
}