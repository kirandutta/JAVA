interface area
{
    static final float pi=3.14F;
    float compute(float x,float y);
}

class rectangle implements area
{
    public float compute(float x,float y)
    {
        return(x*y);
    }
}

class Circle implements area
{
    public float compute(float x,float y)
    {
        return (pi*x*x);
    }
}

public class Subhajit {
    public static void main(String args[])
    {
        rectangle r=new rectangle();
        Circle c=new Circle();
        area a;
        a=r;
        System.out.println(a.compute(10, 10));
        a=c;
        System.out.println(a.compute(10, 10));
    }
}
