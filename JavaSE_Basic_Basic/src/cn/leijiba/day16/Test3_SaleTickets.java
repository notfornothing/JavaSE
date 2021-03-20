package cn.leijiba.day16;

/**
 * @Author notfornothing
 * @Date 2021/3/19 16:20
 */
public class Test3_SaleTickets {
    public static void main(String[] args) {

        TicketThread thread = new TicketThread();
        thread.start();
        new TicketThread().start();
        new TicketThread().start();
        new TicketThread().start();
        new TicketThread().start();
    }
}

class TicketThread extends Thread {
   static int ticket = 100;
    @Override
    public void run() {
        while (true) {
            try {
                sleep(100);
                System.out.println();
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "=" + ticket--);
            if (ticket <=0) {
                break;
            }
        }
    }
}
