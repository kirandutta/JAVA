public class Test extends Thread 
{
    public void run()
    {
        // Thread.currentThread().setName("Subhajit");
        System.out.println("Thread: "+Thread.currentThread().getName());
    }
    public static void main(String args[])
    {
        System.out.println("Thread: "+Thread.currentThread().getName());
        Test t1=new Test();
        t1.setName("Subhajit");
        t1.start();
        // System.out.println(Thread.currentThread().isAlive());
        System.out.println(t1.isAlive());
    }
}
