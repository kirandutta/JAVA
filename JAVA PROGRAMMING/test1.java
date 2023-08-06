interface I1
{
    void show();
}
interface I2
{
    void display();
}

class test1 implements I1,I2
{
    public void show()
    {
        System.out.println("1");
    }
    public void display()
    {
        System.out.println("2");
    }
    public static void main(String args[])
    {
        test1 t1=new test1();
        t1.show();
        t1.display();
    }
}