import org.ietf.jgss.Oid;

class A extends Thread
{
    public void run()
    {
        System.out.println("Thread A started.");
        for(int i=0;i<5;i++)
        System.out.println(Thread.currentThread()+" "+i);
        System.out.println("Exit from Thread A");
    }
}

class B extends Thread
{
    public void run()
    {
        System.out.println("Thread B started.");
        for(int i=0;i<5;i++)
        System.out.println(Thread.currentThread()+" "+i);
        System.out.println("Exit from Thread B");
    }
}

class C extends Thread{
    public void run()
    {
        System.out.println("Thread C started.");
        for(int i=0;i<5;i++)
        System.out.println(Thread.currentThread()+" "+i);
        System.out.println("Exit from Thread C");
    }
}

public class priority2 
{
    public static void main(String args[])  throws Exception
    {
        // Thread.currentThread().setPriority(9);
        A threadA=new A();
        B threadB=new B();
        C threadC=new C();

        threadC.setPriority(6);
        threadB.setPriority(threadB.getPriority()+3);
        threadA.setPriority(threadA.getPriority()+3);

        System.out.println("Start thread A");
        threadA.start();

        System.out.println("Start thread B");
        threadB.start();

        System.out.println("Start thread C");
        threadC.start();
    }    
}
