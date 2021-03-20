package cn.leijiba.day16;

/**
 * @Author notfornothing
 * @Date 2021/3/19 14:35
 */
public class Test1_Thread {
    public static void main(String[] args) {
        Thread thread = new Thread();
        myThread myThread = new myThread();
        myThread myThread2 = new myThread("lalalla");
        myThread2.setName("asdfasdf");
        myThread.start();
        myThread2.start();
    }
}

class myThread extends Thread {
    public myThread(String name) {
        super(name);
    }

    public myThread() {
    }

    /*
          @Override
        public void run() {
            if (target != null) {
                target.run();
            }
        }
         */
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + "=" + getName());
        }
    }
}