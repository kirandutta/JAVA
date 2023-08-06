import java.util.Scanner;

public class triangle {
    public static void main(String args[])
    {
        input();
    }    
    public static void input()
    {
        int a,b,c;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the 3 sides of the triangle: ");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        calculation(a,b,c);
    }
    public static void calculation(int x,int y,int z)
    {
        if(x==y && y==z)
        System.out.println("The triangle is equilateral......");
        else if ((x==y && y!=z)|| (y==z && z!=x) || (x==z && x!=y))
        System.out.println("The triangle is isosceles......");
        else
        System.out.println("The triangle is scalene");
    }
}
