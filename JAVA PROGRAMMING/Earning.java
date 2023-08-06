class TotalEarning extends Thread {
    int total = 0;

    public void run() {
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                total += 100;
                this.notify();
            }
        }
    }
}

public class Earning {
    public static void main(String args[]) throws Exception {
        TotalEarning t = new TotalEarning();
        t.start();
        synchronized (t) {
            t.wait();
            System.out.println("The total earning is " + t.total);
        }
    }
}
