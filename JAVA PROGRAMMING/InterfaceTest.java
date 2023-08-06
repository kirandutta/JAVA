interface Area
{
    final static float pi=3.14F;
    float compute(float x,float y);
}

class Rectangle10 implements Area
{
    public float compute(float x,float y)
    {
        return (x*y);
    }
}

class Circle implements Area
{
    public float compute(float x,float y)
    {
        return (pi*x*x);
    }
}

public class InterfaceTest {
    public static void main(String args[])
    {
        Rectangle10 rect=new Rectangle10();
        Circle cir=new Circle();
        Area area;
        area=rect;
        System.out.println("Area of the rectangle = "+area.compute(10,20));
        area=cir;
        System.out.println("Area of Circle = "+area.compute(10,0));
    }
}

