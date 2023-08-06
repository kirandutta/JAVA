public class varargs2 {
    static void va1(int ... v)
    {
        System.out.println("No of arguments: "+v.length+" Contents");
        for(int x:v)
        System.out.print(x+" ");
        System.out.println();
    }
    varargs2(String ... v)
    {
        System.out.println("No of names: "+v.length+" Contents");
        for(String x:v)
        System.out.print(x+" ");
        System.out.println();
    }
    public static void main(String args[])
    {
        va1(1,2,65,2,5,7,8);
        va1();
        va1(47,58,0,3,69);
        varargs2 in=new varargs2("Rohan","Subhajit","Argha");
    }
}
