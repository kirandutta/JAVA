public class Daemon extends Thread 
{
    public void run()
    {
        if(Thread.currentThread().isDaemon())
        System.out.println("Daemon Thread");
        else
        System.out.println("Child Thread");
    }
    public static void main(String args[])
    {
        System.out.println("Main Thread");
        Daemon t=new Daemon();
        t.setDaemon(true);
        t.start();
    }   
}
