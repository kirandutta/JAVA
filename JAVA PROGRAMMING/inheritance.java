import java.util.Scanner;

public class inheritance {
    public static void main(String args[])
    {
        float a,b,c;
      Scanner in =new Scanner(System.in);
      System.out.println("Enter the length,breadth and height of the room:");  
      a=in.nextFloat();
      b=in.nextFloat();
      c=in.nextFloat();
      bedroom a1=new bedroom(a,b,c);
      System.out.println("Area "+a1.area());
      System.out.println("Volume "+a1.volume());
    }
}
class room
{
    float length,breadth;
    room(float x,float y)
    {
        length=x;
        breadth=y;
    }
    float area()
    {
        return (length*breadth);
    }
}
class bedroom extends room
{
    float height;
    bedroom(float x,float y,float z)
    {
        super(x,y);
        height=z;
    }
    float volume()
    {
        return (length*breadth*height);
    }
}