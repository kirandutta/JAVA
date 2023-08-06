// public class sleep {
//     public static void main(String args[])throws Exception
//     {
//         for(int i=0;i<5;i++)
//         {
//             Thread.sleep(2000);
//             System.out.println(i);
//         }
//     }
    
// }
class sleep extends Thread
{
    public void run()
    {
        for(int i=0;i<=5;i++)
        {
            try{
                Thread.sleep(1000);
                System.out.println(i);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
    public static void main(String args[]) 
    {
        sleep t=new sleep();
        t.start();
    }
}