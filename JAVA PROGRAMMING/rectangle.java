public class rectangle {
    public static void main(String args[])
    {
        room a1=new room(15,10);
        room a2=new room(10);
        System.out.println("The area of the 1st rectangle is "+a1.area());
        System.out.println("The area of the 2nd reactangle is "+a2.area());
    }   
}
class room
{
    int length,breadth;
    room(int x,int y)
    {
        length=x;
        breadth=y;
    }
    int area()
    {
        return(length*breadth);
    }
    room(int x)
    {
        length=breadth=x;
    }
}