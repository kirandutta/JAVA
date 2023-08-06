public class Math {
    public static void main(String args[])
    {
        float a,b;
        a=operations.mul(4,5);
        b=operations.div(a,2);
        System.out.println("The value of b is "+b);
    }    
}
class operations
{
    static float mul(float x, float y)
    {
        return(x*y);
    }
    static float div(float x,float y)
    {
        return(x/y);
    }
}
