public class join extends Thread {
    static Thread mainthread;

    public void run() 
    {
        try {
            mainthread.join();
            for (int i = 0; i < 5; i++) {
                System.out.println("Child Thread " + i);
                Thread.sleep(2000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String args[]) throws InterruptedException {
        mainthread = Thread.currentThread();
        join j = new join();
        j.start();
        // j.join();
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Main Thread " + i);
                Thread.sleep(2000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
