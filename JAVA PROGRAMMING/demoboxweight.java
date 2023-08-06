class box{
    double length,breadth,height;
    box(double l,double b,double h)
    {
        length=l;
        breadth=b;
        height=h;
    }
    box()
    {
        length=32;
        breadth=20;
        height=1;
    }
    box(double l)
    {
        length=breadth=height=l;
    }
    double volume()
    {
        return(length*breadth*height);
    }
}

class weight extends box{
    double weight;
    weight(double l,double b,double h,double w)
    {
        super(l,b,h);
        weight=w;
    }
    double weight2()
    {
        return (weight);
    }
}

public class demoboxweight {
    public static void main(String args[]){
        weight w1=new weight(10,12,4,0.36);
        weight w2=new weight(10,14,10,36);
        System.out.println("The volume of the 1st box is "+w1.volume());
        System.out.println("The volume of the 2nd box is "+w2.volume());
        System.out.println("Weight of the 1st box is "+w1.weight2());
        System.out.println("Weight of the 2nd box is "+w2.weight2());
    }
}
