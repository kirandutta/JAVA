public class yield1 extends Thread
 {
    public void run()
    {
        Thread.yield();
        for(int i=0;i<=5;i++)
        {
            System.out.println(Thread.currentThread().getName()+" : "+i);
        }
    } 
    public static void main(String args[])
    {
        yield1 t=new yield1();
        t.start();
        // Thread.yield();
        
        for(int i=0;i<=5;i++)
        {
            System.out.println(Thread.currentThread().getName()+" : "+i);
        }
    }  
}
