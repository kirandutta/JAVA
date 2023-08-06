class BookTheaterSeat
{
    int total=10;
    synchronized void bookseat(int seats)
    {
        if(total>=seats)
        {
            System.out.println("Seats booked successfully.");
            total=total-seats;
            System.out.println("Seats left: "+total);
        }
        else{
            System.out.println("Seats cannot be booked.");
            System.out.println("Seats left: "+total);
        }
    }
}

public class MovieBookApp extends Thread
{
    static BookTheaterSeat b;
    int seats;
    public void run() 
    {
        b.bookseat(seats);
    }  
    public static void main(String args[])
    {
        b=new BookTheaterSeat();
        MovieBookApp deepak=new MovieBookApp();
        deepak.seats=7;
        deepak.start();
        MovieBookApp ram=new MovieBookApp();
        ram.seats=6;
        ram.start();
    }
}
