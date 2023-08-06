

public class Nesting {
    public static void main(String args[])
    {
        nes a=new nes(50,60);
        a.display();
    }
}
 
class nes
{
    int m,n;
    nes(int x,int y)
    {
        m=x;
        n=y;
    }
    int largest()
    {
        if(m>n)
        return(m);
        else
        return n;
    }
    void display()
    {
        System.out.println("The largest number is "+largest());
    }
}