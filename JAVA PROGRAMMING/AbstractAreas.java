abstract class Figure{
    double dim1,dim2;

    Figure(double a,double b)
    {
        dim1=a;
        dim2=b;
    }

    abstract double area();
}

class Rectangle20 extends Figure{
    Rectangle20(double a,double b){
        super(a,b);
    }

    double area(){
        System.out.println("Inside Area for Rectangle.");
        return dim1*dim2;
    }
}

class Triangle extends Figure{
    Triangle(double a,double b){
        super(a,b);
    }

    double area(){
        System.out.println("Inside Area for Triangle.");
        return dim1*dim2/2;
    }
}

public class AbstractAreas {
    public static void main(String args[])
    {
        Rectangle20 r=new Rectangle20(9,5);
        Triangle t=new Triangle(10,8);
        Figure figref;
        figref=r;
        System.out.println("Area is "+figref.area());
        figref=t;
        System.out.println("Area is "+figref.area());
    }
}