package cn.leijiba.day16;

/**
 * @Author notfornothing
 * @Date 2021/3/19 17:05
 */
public class Test4_SaleTickets2 {
    public static void main(String[] args) {

        TicketsRunnable ticketsRunnable = new TicketsRunnable();
        Thread thread = new Thread(ticketsRunnable);
        Thread thread1 = new Thread(ticketsRunnable);
        Thread thread2= new Thread(ticketsRunnable);
        Thread thread3= new Thread(ticketsRunnable);
        thread.start();
        thread1.start();
        thread2.start();
        thread3.start();
    }


}

class TicketsRunnable implements Runnable {
    static int tickets = 100;

    @Override
    public void run() {

        while (true) {

            if (tickets > 0) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName()+"="+tickets--);
            }
            if (tickets <= 0) {
                break;
            }
        }
    }
}