import java.util.concurrent.ThreadLocalRandom;

public class Priority extends Thread {
    public void run()
    {
        System.out.println("Child priority");
        System.out.println(Thread.currentThread().getPriority());
    }
    public static void main(String args[])
    {
        System.out.println("Main Thread old Priority: "+Thread.currentThread().getPriority());
        // Thread.currentThread().setPriority(MAX_PRIORITY);
        Thread.currentThread().setPriority(7);
        System.out.println("Main Thread new Priority: "+Thread.currentThread().getPriority());
        Priority t=new Priority();
        t.setPriority(6);
        t.start();
    }
}
