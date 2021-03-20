package cn.leijiba.day16;

/**
 * @Author notfornothing
 * @Date 2021/3/19 15:42
 */
public class Test2_Thread {
    public static void main(String[] args) {


        MyRunnable runnable = new MyRunnable();
        runnable.run();
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("======");
        new Thread(() ->
        {
            for (int i = 0; i < 10; i++) {
                System.out.println(i + ":" + Thread.currentThread().getName());
            }
        }).start();
        new Thread(() ->
        {
            for (int i = 0; i < 10; i++) {
                System.out.println(i + ":" + Thread.currentThread().getName());
            }
        }).start();
        new Thread(() ->
        {
            for (int i = 0; i < 10; i++) {
                System.out.println(i + ":" + Thread.currentThread().getName());
            }
        }).start();
    }
}
class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {

            System.out.println(i + ":" + Thread.currentThread().getName());
        }
   }
}
