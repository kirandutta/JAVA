class Booking {
    int total_seats = 10;

    void calculation(int seats) {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        synchronized (this) {
            if (total_seats >= seats) {
                System.out.println("Seats booked successfully.");
                total_seats = total_seats - seats;
                System.out.println("Seats left: " + total_seats);
            } else {
                System.out.println("Seats cannot be booked.");
                System.out.println("Seats left: " + total_seats);
            }
        }
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
    }
}

public class Theatre extends Thread
{   
    static Booking b;
    int seats;
    public void run()
    {
        b.calculation(seats);
    }
    public static void main(String args[])
    {
        b=new Booking();
        Theatre deepak=new Theatre();
        deepak.seats=8;
        deepak.start();
        Theatre ram=new Theatre();
        ram.seats=4;
        ram.start();
    }
}