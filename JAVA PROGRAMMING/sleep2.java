public class sleep2 extends Thread 
{
    public void run() 
    {
        try{
            for(int i=0;i<=6;i++)
            {
                Thread.sleep(1000);
                System.out.println(i+" : "+Thread.currentThread().getName());   
            }
        }
        catch(Exception e)
            {
                System.out.println(e);
            }
    }  
    public static void main(String args[])
    {
        sleep2 t1=new sleep2();
        t1.start();
        sleep2 t2=new sleep2();
        t2.start();
    }
}