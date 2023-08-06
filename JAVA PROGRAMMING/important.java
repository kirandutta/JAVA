import java.util.Scanner;

public class important {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n;
        int a[]=new int[6];
        System.out.println("Enter the number of elements:\n");
        n=in.nextInt();
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++)
        a[i]=in.nextInt();
        for(int i: a)
        {
        System.out.print(i+" ");
        i=i*10;
        }
        System.out.println();
        for(int x: a)
        System.out.print(x+" ");
        System.out.println();
    }
    
}
