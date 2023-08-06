public class interrupted extends Thread {
    public void run()
    {
        // System.out.println(Thread.interrupted());
        System.out.println(Thread.interrupted());
        // System.out.println(Thread.currentThread().isInterrupted());
        // System.out.println(Thread.currentThread().isInterrupted());
        try{
            for(int i=0;i<5;i++)
            {
            System.out.println(i);
            Thread.sleep(1000);
            System.out.println(Thread.interrupted());
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void main(String args[])
    {
        interrupted t=new interrupted();
        t.start();
        t.interrupt();
    }
}
