class box{
    double width,height,depth;
    box(box ob)
    {
        width=ob.width;
        height=ob.height;
        depth=ob.depth;
    }
    box(double w, double h, double d)
    {
        width=w;
        height=h;
        depth=d;
    }
    box()
    {
        width=-1;
        height=-1;
        depth=-1;
    }
    box(double len)
    {
        width=height=depth=len;
    }
    double volume()
    {
        return (width*depth*height);
    }
}

public class overloadcons {
    public static void main(String args[])
    {
        box mybox1=new box(10,20,15);
        box mybox2=new box();
        box mycube=new box(7);
        box myclone=new box(mybox1);
        double vol;
        vol=mybox1.volume();
        System.out.println("Volume of mybox1 is "+vol);
        vol=mybox2.volume();
        System.out.println("Volume of mybox2 is "+vol);
        vol=mycube.volume();
        System.out.println("Volume of cube is "+vol);
        vol=myclone.volume();
        System.out.println("Volume of clone is "+vol);
    } 
}